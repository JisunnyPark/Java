package CodingTest;

import java.util.Scanner;

public class Date220430_11 {

	public static void main(String[] args) {
		// º° Âï±â - 1
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String space = " ";
		String star = "*";
		for(int i = 1; i <= num; i++) {
			for(int j = num-i; j >= 1; j--) {
				System.out.print(space);
			}
			System.out.println(star);
			star += "*";
		}	
	}
}
