package CodingTest;

import java.util.Scanner;

public class Date220424_4 {

	public static void main(String[] args) {
		// 사분면 고르기
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		if(a > 0 && b > 0) {
			System.out.println("1");
		} else if(a < 0 && b > 0) {
			System.out.println("2");
		} else if(a < 0 && b < 0) {
			System.out.println("3");
		} else {
			System.out.println("4");
		}
		
		
	}

}
