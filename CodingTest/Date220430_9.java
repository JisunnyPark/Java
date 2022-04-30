package CodingTest;

import java.util.Scanner;

public class Date220430_9 {

	public static void main(String[] args) {
		// A+B - 8
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a = 0;
		int b = 0;
		
		for(int i = 1; i <= num; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.println(String.format("Case #%d: %d + %d = %d", i, a, b, a+b));
		}
	}
}
