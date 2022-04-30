package CodingTest;

import java.util.Scanner;

public class Date220430_4 {

	public static void main(String[] args) {

		// ºü¸¥ A+B
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result = 0;
		for(int i = 1; i <= num; i++) {
			result += i;
		}
		System.out.println(String.format("%d", result));
	}
}
