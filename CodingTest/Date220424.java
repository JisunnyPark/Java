package CodingTest;

import java.util.Scanner;

public class Date220424 {

	public static void main(String[] args) {
		// 1
		System.out.println("Hello World!");

		// 두 수 비교하기
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
