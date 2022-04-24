package CodingTest;

import java.util.Scanner;

public class Date220424_6 {

	public static void main(String[] args) {
		// ¿Àºì ½Ã°è
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int min = scan.nextInt();
		int time = scan.nextInt();
		
		if(min + time >= 60) {
			if(hour + ((min + time) / 60) >= 24) {
				hour += ((min + time) / 60) - 24;
			} else {
				hour += (min + time) / 60;
			}
			min = (min + time) - 60 * ((min + time) / 60);

			System.out.printf("%d %d", hour, min);

		} else {
			System.out.printf("%d %d", hour, min+time);
		}
		
		
	}

}
