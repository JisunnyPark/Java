package CodingTest;

import java.util.Scanner;

public class Date220430_14 {

	public static void main(String[] args) {
		// A+B - 5
		Scanner scan = new Scanner(System.in);

		while(true) {
			int input1 = scan.nextInt();
			int input2 = scan.nextInt();
			if(input1 == 0 && input2 == 0) {
				break;
			}
			System.out.println(input1 + input2);
		}
	}
}
