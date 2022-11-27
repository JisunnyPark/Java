package ch01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q02_5397 {
	/*
	 * ch01. 자료구조
	 * 
	 * 5397 키로거(스택, 구현, 그리디) - 중
     * 첫째 줄에 테스트 케이스의 개수가 주어진다. 
     * 각 테스트 케이스는 한줄로 이루어져 있고, 강산이가 입력한 순서대로 길이가 L인 문자열이 주어진다. 
     * (1 ≤ L ≤ 1,000,000) 강산이가 백스페이스를 입력했다면, '-'가 주어진다. 이때 커서의 바로 앞에 글자가 존재한다면, 그 글자를 지운다. 
     * 화살표의 입력은 '<'와 '>'로 주어진다. 이때는 커서의 위치를 움직일 수 있다면, 왼쪽 또는 오른쪽으로 1만큼 움직인다. 
     * 나머지 문자는 비밀번호의 일부이다. 물론, 나중에 백스페이스를 통해서 지울 수는 있다. 
     * 만약 커서의 위치가 줄의 마지막이 아니라면, 커서 및 커서 오른쪽에 있는 모든 문자는 오른쪽으로 한 칸 이동한다.
     * 
	 * */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();

		int n = Integer.parseInt(br.readLine()); // 이 부분에서 계속 런타임 오류났었..
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == '<') {
					if(!left.isEmpty()) {
						right.push(left.pop());
					}
				} else if(s.charAt(j) == '>') {
					if(!right.isEmpty()) {
						left.push(right.pop());
					}
				} else if(s.charAt(j) == '-') {
					if(!left.isEmpty()) {
						left.pop();
					}
				} else {
					left.push(s.charAt(j));
				}
			}

			StringBuilder sb = new StringBuilder();
			
			while(!right.isEmpty()) {
				left.push(right.pop());
			}
			
			while(!left.isEmpty()) {
				sb.append(left.pop());
			}

			System.out.println(sb.reverse().toString());
		}

	}
}
