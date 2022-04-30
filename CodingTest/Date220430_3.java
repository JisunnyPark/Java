package CodingTest;

import java.util.Scanner;

public class Date220430_3 {

	public static void main(String[] args) {

		// A+B - 3
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		
		for(int i = 1; i <= cnt; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(String.format("%d", a+b));
		}
	}
}
