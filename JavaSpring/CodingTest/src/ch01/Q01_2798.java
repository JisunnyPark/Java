package ch01;
import java.util.Scanner;

public class Q01_2798 {
	/*
	 * ch01. �ڷᱸ��
	 * 
	 * 2798 ����(�迭, ����Ž��)
	 * ù° �ٿ� M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ����Ѵ�.
     * 
     * -----
     * 3�� �ݺ����� ����Ͽ� ��� ����� ���� ��� 
     * ==> 1, 2��° ���� ���� 3��°���� 4��° 5��°... for������ ��
     * max�� ����Ͽ� ��� ū ������ ����
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
