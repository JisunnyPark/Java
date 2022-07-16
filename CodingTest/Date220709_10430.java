package CodingTest;

import java.util.Scanner;

public class Date220709_10430 {

	public static void main(String[] args) {
		// ³ª¸ÓÁö

		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		sb.append((a+b) % c + "\n");
		sb.append(((a%c) + (b%c)) % c + "\n");
		sb.append((a*b) % c + "\n");
		sb.append(((a%c) * (b%c)) % c + "\n");
		
		System.out.println(sb);
	}

}
