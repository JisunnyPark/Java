package CodingTest;

import java.util.Scanner;

public class Date220424_5 {

	public static void main(String[] args) {
		// 알람 시계
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int min = scan.nextInt();
		
		if(min - 45 < 0) {
			if(hour == 0) {
				System.out.printf("%d %d", 23, 60-45+min);
			} else {
				System.out.printf("%d %d", hour-1, 60-45+min);
			}
		} else {
			System.out.printf("%d %d", hour, min-45);
		}
		
		
	}

}
