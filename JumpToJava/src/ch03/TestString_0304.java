package ch03;
/*
 *  String a변수에 헬로우 자바 선언
 *  자바 글자가 포함 되어 있는가
 *  자바를 월드로 변경
 *  헬까지 출력
 *  올 대문자로 출력하기
 */
public class TestString_0304 {

	public static void main(String[] args) {
		String a = "Hello Java";
		System.out.println(a.indexOf("Java"));
		System.out.println(a.replaceAll("Java", "World"));
		System.out.println(a.substring(0, 4));
		System.out.println(a.toUpperCase());
				

	}

}
