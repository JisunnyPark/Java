package ch5;

import java.util.Scanner;

public class MultiArrEx4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q.%d %s의 뜻은?", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if (tmp.equals(words[i][1])) {
				System.out.println("정답입니다!!");
			} else {
				System.out.printf("땡!! 정답 : %s %n", words[i][1]);
			}
		}

	}

}
