package ch01;
import java.util.Scanner;

public class Q2920 {
	/*
	 * ch01. �ڷᱸ��
	 * 
	 * 2920 ����
	 * 1���� 8���� ���ʴ�� �����Ѵٸ� ascending, 
	 * 8���� 1���� ���ʴ�� �����Ѵٸ� descending, 
	 * �� �� �ƴ϶�� mixed �̴�.
	 *
     * ������ ������ �־����� ��, �̰��� ascending����, descending����, 
     * �ƴϸ� mixed���� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
     * 
     * -----
     * ù��° �ι�°�� ���ؼ� Ʋ��
     * ==> ����ؼ� �����ϴ��� Ȯ�� �ʿ��ϹǷ� 2���� �� �ʿ�
     * boolean ������ üũ �ʿ�
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
