package CodingTest;

import java.util.LinkedList;
import java.util.Scanner;

public class Date220703_10866 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		LinkedList<Integer> d = new LinkedList<Integer>();
		
		int num = scan.nextInt();
		for(int i = 0; i < num; i++) {
			String c = scan.next();
			switch(c) {
			case "push_front" : 
				int n = scan.nextInt();
				d.addFirst(n);
				break;
				
			case "push_back" :
				int n2 = scan.nextInt();
				d.addLast(n2);
				break;
				
			case "pop_front" :
				if(!d.isEmpty()) {
					sb.append(d.pollFirst() + "\n");
				} else {
					sb.append("-1 \n");
				}
				break;
				
			case "pop_back" :
				if(!d.isEmpty()) {
					sb.append(d.pollLast() + "\n");
				} else {
					sb.append("-1 \n");
				}
				break;
				
			case "size" :
				sb.append(d.size() + "\n");
				break;
				
			case "empty" :
				if(d.isEmpty()) {
					sb.append("1 \n");
				} else {
					sb.append("0 \n");
				}
				break;
				
			case "front" :
				if(!d.isEmpty()) {
					sb.append(d.getFirst() + "\n");
				} else {
					sb.append("-1 \n");
				}
				break;
				
			case "back" :
				if(!d.isEmpty()) {
					sb.append(d.getLast() + "\n");
				} else {
					sb.append("-1 \n");
				}
				break;
			}
		}
		System.out.println(sb);
	}

}
