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
			String command = scan.next(); // 배열 or split 안쓰려고
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
					// sb를 사용해야하는 이유ㅎㅎ 한번에 출력해서 속도 줄이기위해, 두자리면 어떡해? --> queue(x) linked 로 변경
					sb.append(q.getLast() + "\n");
				}
			}
		}
		System.out.print(sb);
	} 
}
