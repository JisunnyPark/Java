package ch01;

public class MinMaxProblem {

	public static void main(String[] args) {
		/**
		 * 01. ������ ������ �ּڰ��� �ִ� ���ϱ�
		 * ���� ����
		 * ���� ���� ���� �迭�� ���� �� �� �� ���� ū ���� ���� ���� ���� ã�´�.
		 * �迭�� �� ��°�� �ִ��� ������ ã�´�.
		 * �ݺ����� �ѹ��� ����Ͽ� ������ �ذ��Ѵ�.
		 * ���� �� : [10, 55, 23, 2, 79, 101, 16, 82, 30, 45]
		 * 
		 * �迭�� �ִ� �� �� �� ó���� �ִ� ���� max�� min���� �����ϰ�, 
		 * �迭�� ������ ���ڱ��� ���ϸ鼭 �� ū ���� �� ���� ���� ���ö� max�� min�� ���� �ٲٵ��� �Ѵ�.
		 * �׶��� ��ġ�� ������ �����Ѵ�.
		 */

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int[] num = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		int min = num[0];
		int max = num[0];
		int minPos = 0;
		int maxPos = 0;
		
		
		for(int i=1; i<num.length; i++) {
			if(min > num[i]) {
				min = num[i];
				minPos = i+1;
			}
			
			if(max < num[i]) {
				max = num[i];
				maxPos = i+1;
			}
		}
		System.out.printf("min : %-3d / index : %d \n", min, minPos);
		System.out.printf("max : %-3d / index : %d", max, maxPos);
	}

}
