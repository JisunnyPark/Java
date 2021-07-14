package ch03;

import java.util.ArrayList;

public class Generics_0308 {

	public static void main(String[] args) {
		// 제네릭을 사용하는 이유
		
		// 제네릭 사용 전
		/* ArrayList aList = new ArrayList();
		aList.add("hello");
		aList.add("java");
		
		String hello = (String) aList.get(0);	
		String java = (String) aList.get(1);
		
		--> Object를 String으로 캐스팅한다
		일일이 이런 과정을 피하기 위해 제네릭스를 사용
		*/
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("hello");
		aList.add("java");
		
		String hello = aList.get(0);
		String java = aList.get(1);
	}

}
