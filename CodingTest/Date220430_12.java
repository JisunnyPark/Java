package CodingTest;

import java.util.Scanner;

public class Date220430_12 {

	public static void main(String[] args) {
		// X보다 작은 수
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int x = scan.nextInt();
		int[] numArr = new int[num];
		String result = "";
		
		for(int i = 0; i < num; i++) {
			numArr[i] = scan.nextInt();
			if(numArr[i] < x) {
				result += String.valueOf(numArr[i]) + " "; 
			}
		}
		System.out.println(result);
	}
}
