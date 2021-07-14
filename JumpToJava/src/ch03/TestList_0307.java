package ch03;

import java.util.ArrayList;

/*
 *  어레이 리스트 피치스 138, 129, 142
 *  
 *  1번 값 불러오기
 *  피치 사이즈
 *  142란 값이 있는지 확인
 *  
 *  129 삭제
 *  다시 사이즈 출력
 *  0번 값 삭제
 *  
 *  여기서 제네릭스란 개념이 있는데
 *  어레이 리스트<>에 스트링이라던지, 인티저, 클래스 이름 등
 *  타입을 명시하지 않으면 값 추가엔 문제가 없지만
 *  값을 불러올 때 불러올 타입 명시를 해줘야(형변환) 된다.
 *  
 *  그래서 밑에와 같이 스트링이던지 꺽쇠에 타입 명시를 해줘야 편함
 *  
 */
public class TestList_0307 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("138");
		a.add("129");
		a.add("142");
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.size());
		System.out.println(a.contains("142"));
		
		System.out.println(a.remove("129"));
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.remove(0));
		System.out.println(a);
		
	}

}











