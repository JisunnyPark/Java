package CodingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Date220430 {

	public static void main(String[] args) {

		// �ֻ��� ����
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int[] inputArr = new int[3];
		
		// �ֻ��� �� üũ
		while(cnt <= 2) {
			int input = scan.nextInt(); 
			if(input >= 1 && input <= 6) {
				inputArr[cnt] = input; 
				cnt++;				
			} else {
				System.out.println("1���� 6������ �Է��ϼ���.");
			}
		}
		
		// ��� üũ
		if(inputArr[0] == inputArr[1]) {
			if(inputArr[0] == inputArr[2]) {
				// 1. ���� ���� 3�� ������ ���
				System.out.println(10000 + (inputArr[0] * 1000));
				
			} else {
				// 2. ���� ���� 2���� ������ ���
				System.out.println(1000 + (inputArr[0] * 100));
			}
			
		} else {
			if(inputArr[1] == inputArr[2]) {
				// 2. ���� ���� 2���� ������ ���
				System.out.println(1000 + (inputArr[1] * 100));
				
			} else {
				if(inputArr[0] == inputArr[2]) {
					// 2. ���� ���� 2���� ������ ���
					System.out.println(1000 + (inputArr[0] * 100));
					
				} else {
					// 3. ��� �ٸ� ���� ������ ���
					Arrays.sort(inputArr);
					System.out.println(inputArr[2] * 100);
				}
			}
		}
	}
}
