package CodingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Date220430 {

	public static void main(String[] args) {

		// 주사위 세개
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int[] inputArr = new int[3];
		
		// 주사위 눈 체크
		while(cnt <= 2) {
			int input = scan.nextInt(); 
			if(input >= 1 && input <= 6) {
				inputArr[cnt] = input; 
				cnt++;				
			} else {
				System.out.println("1부터 6까지만 입력하세요.");
			}
		}
		
		// 상금 체크
		if(inputArr[0] == inputArr[1]) {
			if(inputArr[0] == inputArr[2]) {
				// 1. 같은 눈이 3개 나오는 경우
				System.out.println(10000 + (inputArr[0] * 1000));
				
			} else {
				// 2. 같은 눈이 2개만 나오는 경우
				System.out.println(1000 + (inputArr[0] * 100));
			}
			
		} else {
			if(inputArr[1] == inputArr[2]) {
				// 2. 같은 눈이 2개만 나오는 경우
				System.out.println(1000 + (inputArr[1] * 100));
				
			} else {
				if(inputArr[0] == inputArr[2]) {
					// 2. 같은 눈이 2개만 나오는 경우
					System.out.println(1000 + (inputArr[0] * 100));
					
				} else {
					// 3. 모두 다른 눈이 나오는 경우
					Arrays.sort(inputArr);
					System.out.println(inputArr[2] * 100);
				}
			}
		}
	}
}
