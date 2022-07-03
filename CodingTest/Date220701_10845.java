package CodingTest;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Date220701_10845 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		LinkedList<Integer> q = new LinkedList<>();
		int cnt = scan.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			String command = scan.next(); // �迭 or split �Ⱦ�����
			if(command.equals("push")) {
				int num = scan.nextInt();
				q.add(num);
			} else if(command.equals("pop")) {
				if(!q.isEmpty()) {
					sb.append(q.poll() + "\n");
				} else {
					sb.append(("-1 \n"));
				}
			} else if(command.equals("size")) {
				sb.append(q.size()+ "\n");
			} else if(command.equals("empty")) {
				if(q.isEmpty()) {
					sb.append("1 \n");
				} else {
					sb.append("0 \n");
				}
			} else if(command.equals("front")) {
				if(q.isEmpty()) {
					sb.append("-1 \n");
				} else {
					sb.append(q.peek() + "\n");
				}
			} else if(command.equals("back")) {
				if(q.isEmpty()) {
					sb.append("-1 \n");
				} else {
					// sb�� ����ؾ��ϴ� �������� �ѹ��� ����ؼ� �ӵ� ���̱�����, ���ڸ��� ���? --> queue(x) linked �� ����
					sb.append(q.getLast() + "\n");
				}
			}
		}
		System.out.print(sb);
	} 
}
