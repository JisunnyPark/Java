package CodingTest;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Date220430_15 {

	public static void main(String[] args) {
		// 더하기 사이클
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		StringTokenizer st = new StringTokenizer(String.valueOf(num));
		String str = st.nextToken();
		System.out.println(str);
	}
}
