package ch4;

import java.util.Scanner;

public class FlowEx8 {
/*
 * 주민 번호 입력 받기
 * 1, 3 : 남자 / 2, 4 : 여자
 * 나머지 유효하지 않음
 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("- 포함해서 주민등록번호를 입력하세요.");
		String ssn = scanner.nextLine();
		char chkNo = ssn.charAt(7);
		System.out.println(chkNo);

		switch(chkNo) {
		case '1': case '3':
			System.out.println("당신의 성별은 남자입니다.");
			break;
		
		case '2': case '4':
			System.out.println("당신의 성별은 여자입니다.");
			break;
		
		default :
			System.out.println("유효하지 않는 번호입니다.");
			break;
		}
	}

}
