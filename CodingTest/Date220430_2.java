package CodingTest;

import java.util.Scanner;

public class Date220430_2 {

	public static void main(String[] args) {

		// ±¸±¸´Ü
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(String.format("%d * %d = %d", dan, i, dan*i));
		}
	}
}
