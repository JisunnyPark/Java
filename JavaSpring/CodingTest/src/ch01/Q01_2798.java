package ch01;
import java.util.Scanner;

public class Q01_2798 {
	/*
	 * ch01. 자료구조
	 * 
	 * 2798 블랙잭(배열, 완전탐색)
	 * 첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.
     * 
     * -----
     * 3중 반복문을 사용하여 모든 경우의 수를 계산 
     * ==> 1, 2번째 수를 고정 3번째부터 4번째 5번째... for문으로 비교
     * max를 사용하여 계속 큰 값으로 변경
	 * */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] list = new int[n];
		int result = 0;
		int sum = 0;
		
		for(int i = 0; i < list.length; i++) {
			list[i] = scan.nextInt();
		}
		
		for(int i = 0; i < list.length; i++) {
			for(int j = i+1; j < list.length; j++) {
				for(int k = j+1; k < list.length; k++) {
					sum = list[i] + list[j] + list[k];
					if(sum <= m) {
						result = Math.max(result, sum);
					}
				}
			}
		}
		System.out.println(result);
	}
}
