package Test;

public class ForTest_0404 {
	public static void main(String[] args) {
		/*
		 * “총 5명의 학생이 시험을 보았는데 
		 * 시험점수가 60점이 넘으면 합격이고 
		 * 그렇지 않으면 불합격이다. 
		 * 합격인지 불합격인지에 대한 결과를 보여준다.”
		 */
		int[] score = {50, 60, 70, 80, 90};
		for(int i = 0; i < score.length; i++) {
			if(score[i] >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		}
		
		System.out.println("-----");
		// 위와 같은데 continue 사용하여 출력
		int[] score2 = {50, 60, 70, 80, 90};
		for(int i = 0; i < score.length; i++) {
			if(score2[i] < 60) {
				continue;
			}
				System.out.println(i+1+"번님 합격");
	}
		
		// for를 이용한 구구단
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println("");
		}
		
		// for each
		String[] numbers = {"1", "2", "3"};
		for(String num : numbers) {
			System.out.println(num);
		}
		
		}
	}

