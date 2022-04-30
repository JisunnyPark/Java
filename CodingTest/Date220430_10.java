package CodingTest;

import java.util.Scanner;

public class Date220430_10 {

	public static void main(String[] args) {
		// º° Âï±â - 1
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String star = "*";
		for(int i = 1; i <= num; i++) {
			System.out.println(star);
			star += "*";
		}
	}
}
