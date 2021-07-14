package ch03;
/*
 * StringBuffer라고 생성자 만들어서 한 곳에 스트링 자료
 * 저장하는 객체가 있는데, 메모리 소모가 심해서 잘 사용 안함.
 * 
 * 그대신 String 자료형을 쓰면 객체 변경, 추가 할 때마다 
 * 객체가 계속 생성됨 주소가 달라지나 봄
 * 
 * String temp 에 헬로우 자바 투 월드를 저장, 출력해라
 */
public class Test_0305 {
	public static void main(String[] args) {
		String temp = "";
		temp += "Hello";
		temp += " ";
		temp += "to world";
		System.out.println(temp);
	}
}
