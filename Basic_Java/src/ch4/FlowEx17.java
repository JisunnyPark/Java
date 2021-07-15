package ch4;

import java.util.Scanner;

public class FlowEx17 {

	public static void main(String[] args) {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		num = scanner.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
