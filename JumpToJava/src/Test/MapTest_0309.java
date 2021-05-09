package Test;

import java.util.HashMap;

/*
 *  맵은 키와 값을 넣어주고 키를 통해 
 *  추가, 삭제 등이 가능하다.
 *  파이썬에서 딕셔너리와 같은 것.
 *  여기서 제일 간단한 맵은 해쉬맵이며
 *  필요에 따라 링크드맵, 트리맵을 만들 수도 있다(나중에 할 것)
 *  
 *  LinkedHashMap은 입력된 순서대로 데이터가 출력되는 특징을 가지고 있다.
	TreeMap은 입력된 key의 소트순으로 데이터가 출력되는 특징을 가지고 있다.
 *  
 *  해쉬맵 생성하여
 *  피플 : 피플
 *  베이스볼 : 야구 추가하여
 *  피플 키를 통해 값 불러오기
 *  피플이 맵에 있는지 확인
 *  피플 키 삭제
 *  맵 사이즈 출력하라
 *  
 */
public class MapTest_0309 {
	public static void main(String[] args) {
		HashMap<String, String> m = new HashMap<>();
		m.put("people", "사람");
		m.put("baseball", "야구");
		
		System.out.println(m);
		System.out.println(m.get("people"));
		System.out.println(m.containsKey("people"));
		System.out.println(m.remove("people"));
		System.out.println(m);
		System.out.println(m.size());
		
	}
}
