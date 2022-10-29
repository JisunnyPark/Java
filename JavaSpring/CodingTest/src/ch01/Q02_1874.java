package ch01;
import java.util.Scanner;
import java.util.Stack;

public class Q02_1874 {
	/*
	 * ch01. �ڷᱸ��
	 * 
	 * 1874 ���� ����(����, �׸���)
	 * ���� (stack)�� �⺻���� �ڷᱸ�� �� �ϳ���, ��ǻ�� ���α׷��� �ۼ��� �� ���� �̿�Ǵ� �����̴�. 
	 * ������ �ڷḦ �ִ� (push) �Ա��� �ڷḦ �̴� (pop) �Ա��� ���� 
	 * ���� ���߿� �� �ڷᰡ ���� ���� ������ (LIFO, Last in First out) Ư���� ������ �ִ�.
	 * 
	 * 1���� n������ ���� ���ÿ� �־��ٰ� �̾� �þ�������ν�, �ϳ��� ������ ���� �� �ִ�. 
	 * �̶�, ���ÿ� push�ϴ� ������ �ݵ�� ���������� ��Ű���� �Ѵٰ� ����. 
	 * ������ ������ �־����� �� ������ �̿��� �� ������ ���� �� �ִ��� ������, 
	 * �ִٸ� � ������ push�� pop ������ �����ؾ� �ϴ����� �˾Ƴ� �� �ִ�. 
	 * �̸� ����ϴ� ���α׷��� �ۼ��϶�.
	 * 
	 * �Էµ� ������ ����� ���� �ʿ��� ������ �� �ٿ� �� ���� ����Ѵ�. 
	 * push������ +��, pop ������ -�� ǥ���ϵ��� �Ѵ�. �Ұ����� ��� NO�� ����Ѵ�.
     * 
     * -----
	 * */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<Integer>();
		int num = scan.nextInt();
		// �ݺ��� ���� ������ ���� ����
		int count = 1;
		
		// ��������
		for(int i = 0; i < num; i++) {
			int n = scan.nextInt();
			while(count <= n) {
				stack.push(count);
				sb.append("+ \n");
				count++;
			}
			
			// ���������� ��ų �� �ִ��� Ȯ��
			if(stack.peek() == n) {
				stack.pop();
				sb.append("- \n");
			} else {
				System.out.println("NO");
				System.exit(0);
			}
		}

		System.out.println(sb.toString());
	}
}
