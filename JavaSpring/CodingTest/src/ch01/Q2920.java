package ch01;
import java.util.Scanner;

public class Q2920 {
	/*
	 * ch01. 자료구조
	 * 
	 * 2920 음계
	 * 1부터 8까지 차례대로 연주한다면 ascending, 
	 * 8부터 1까지 차례대로 연주한다면 descending, 
	 * 둘 다 아니라면 mixed 이다.
	 *
     * 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 
     * 아니면 mixed인지 판별하는 프로그램을 작성하시오.
     * 
     * -----
     * 첫번째 두번째만 비교해서 틀림
     * ==> 계속해서 유지하는지 확인 필요하므로 2개씩 비교 필요
     * boolean 변수로 체크 필요
	 * */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] list = new int[8];
		boolean asc = true;
		boolean desc = true;
		
		for(int i = 0; i < list.length; i++) {
			list[i] = scan.nextInt();
		}
		
		for(int i = 1; i < list.length; i++) {
			if(list[i] > list[i-1]) {
				desc = false;
			} else {
				asc = false;
			}
		}
		
		if(asc) {
			System.out.println("ascending");
		} else if(desc) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}
