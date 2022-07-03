package CodingTest;

import java.util.LinkedList;
import java.util.Scanner;

public class Date220703_1158 {
// 요세푸스 문제
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		LinkedList<Integer> q1 = new LinkedList<>();
		LinkedList<Integer> q2 = new LinkedList<>();
		int n = scan.nextInt();
		int k = scan.nextInt();
		for(int i = 1; i <= n; i++) {
			q1.add(i);
		}	
		sb.append("<");
		int c = 0;
		while(!q1.isEmpty()) {
			c++;
			
			if(c == k) {
				int p = q1.poll();
				sb.append(p);
				q2.add(p);
				if(!q1.isEmpty()) {
					sb.append(", ");
				} else {
					sb.append(">");
				}
				c = 0;
			} else {
				q1.add(q1.poll());
			}	
		}
		System.out.println(sb.toString());
	}
}
