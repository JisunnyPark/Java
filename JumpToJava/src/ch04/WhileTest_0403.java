package ch04;

public class WhileTest_0403 {
	public static void main(String[] args) {
		/*
		 * 열 번 찍어 안 넘어 가는 나무 없다
		 */
		int hit = 0;
		while(hit < 10) {
			hit++;
			System.out.printf("나무를 %d번 찍었습니다. \n", hit);
			if(hit == 10) {
				System.out.println("나무가 넘어갑니다");
			}
		}
		
		/*
		 * "돈을 받으면 커피를 줘라"
		 */
		int coffee = 10;
		int money = 5000;
		while(money > 0) {
			System.out.println("돈을 냈으니 커피 드릴게요");
			coffee--;
			System.out.println("남은 커피 : " + coffee);
			System.out.println();
			if(coffee == 0) {
				System.out.println("커피 품절입니다~~");
				break;
			}
		}
		/*
		 * 1부터 10까지 홀수만을 출력
		 */
		int number = 0;
		while(number < 10) {
			number++;
			if(number % 2 == 0) {
				continue; // 맨 처음으로 돌아가는 명령어 --> 짝수일 경우 수행X
			}
			System.out.println(number);
		}
	}
}














