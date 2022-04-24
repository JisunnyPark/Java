package CodingTest;

import java.util.Scanner;

public class Date220424_2 {

	public static void main(String[] args) {
		// 시험 성적
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a > b) {
			System.out.println(">");
		} else if(a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		
	}

}
