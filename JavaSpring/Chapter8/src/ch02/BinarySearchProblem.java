package ch02;

public class BinarySearchProblem {

	public static void main(String[] args) {
		/**
		 * 02. ���ĵ� ������ �ϳ��� ���� ��ġ ã��
		 * ���� ���� ���� ���ĵ� ������ ���� �� Ư���� ���� ã�� ���
		 * �ܼ� �ݺ����� �̿��ϸ� ���� ������ ���� �� Ƚ���� �����ϴ� O(n)�� ������ �̷����
		 * �� ���� ���ĵ� ���¿����� ���� Ž��(binary search)�� Ȱ���ϸ� �� 
		 * �Ź� �񱳵Ǵ� ����� ���� �������� ���ҵ� �� �����Ƿ� O(logN)�� �������� ���ϴ� ���� ã�� �� ����
		 * ���� �� : [12, 25, 31, 48, 54, 66, 70, 83, 95, 108]
		 * 83�� ��ġ�� ã�ƺ�����
		 * 88�� ��ġ�� ã�ƺ�����
		 * 
		 * ���� ���ĵ� �����̹Ƿ� �߰��� ���� �ϳ� �����Ѵ�. 
		 * ã������ ���� �׺��� ũ�� ������ ���������� �׺��� ������ ������ �������� ������ �ִ�.
		 * �ѹ� �� �Ҷ� ���� 1/2�� ������ ��������.
		 */
		
		int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
		int target = 83;
		int left = 0;
		int right = numbers.length-1;
		int mid = (left + right)/2;
		int temp = numbers[mid];
		boolean find = false;
		
		while(left <= right) { // while(true)�� ���� �ǹ̾ƴѰ�?
			if(target == temp) {
				find = true;
				break;
			} else if(target > temp) {
				left = mid+1;
			} else {
				right = mid-1;
			}
			mid = (left + right)/2;
			temp = numbers[mid]; 
		}
		
		if(find) {
			mid++;
			System.out.println("ã�� ���� ��ġ�� " + mid + "��° �Դϴ�.");
		} else {
			System.out.println("ã�� ���� �����ϴ�.");
		}
		
		/*
		 * ���� Ǯ��
		 * �߸��� �� : 
		 * �̹� ������������ ���ĵǾ� �ִ� ���� ���� index 0���� �ϳ��ϳ� ���� �ʿ� ����
		 * �迭�� �߰� ���� �������� up&down ����ó�� ó�� �ʿ�
		 * 
		 * + ������ �ȵǾ��ִٸ�??
		 * �� ���� ���� ���� ���� �����ؼ� Ǯ���
		 */
		
//		int[] num = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
//		int n = 83;
//		
//		for(int i=0; i<num.length; i++) {
//			if(n == num[i]) {
//				System.out.printf("%d�� ��ġ : %d", n, i);
//			}
//		}	
	}

}
