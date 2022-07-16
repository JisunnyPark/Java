package CodingTest;

import java.util.Scanner;

public class Date220716_2609 {

	public static void main(String[] args) {
		// 최대공약수와 최소공배수
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int aa = 0;
		int bb = 0;
		int x = 1;
		for(int i = 2; i <= 10000; i++) {
			while(a % i == 0 && b % i == 0) {
				a /= i;
				b /= i;
				x *= i;
			}
		}
		System.out.println(x);
		System.out.println(x*a*b);
	}
}
