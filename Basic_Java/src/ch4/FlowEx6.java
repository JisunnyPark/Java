package ch4;

import java.util.Scanner;

// 현재 월 입력, month에 저장, 3~5 : 봄, 6~8 : 여름, 9~11 : 가을, 나머지 : 겨울
public class FlowEx6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("현재 월을 입력 하세요");
		int month = scanner.nextInt();
		
		switch (month) {
		case 3: 
		case 4:
		case 5:
			System.out.println("현재 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("현재 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재 계절은 가을입니다.");
			break;
		default:
			// case 12: case 1: case 2:
			System.out.println("현재 계절은 겨울입니다.");
		}
		

	}

}
