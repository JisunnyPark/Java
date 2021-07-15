package ch4;

import java.util.Scanner;

/*
score, grade 변수 생성
점수 입력 scanner 함수 생성
점수 저장
점수가 90점 이상이면 A, 80 B, 70 C, 나머지 D
*/

public class FlowEx4 {

	public static void main(String[] args) {
		int score = 0;
		String grade = " ";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		score = scanner.nextInt();
		
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else {
			grade = "D";
		}
		
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}

}
