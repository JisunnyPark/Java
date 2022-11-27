package ch01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q02_5397 {
	/*
	 * ch01. �ڷᱸ��
	 * 
	 * 5397 Ű�ΰ�(����, ����, �׸���) - ��
     * ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. 
     * �� �׽�Ʈ ���̽��� ���ٷ� �̷���� �ְ�, �����̰� �Է��� ������� ���̰� L�� ���ڿ��� �־�����. 
     * (1 �� L �� 1,000,000) �����̰� �齺���̽��� �Է��ߴٸ�, '-'�� �־�����. �̶� Ŀ���� �ٷ� �տ� ���ڰ� �����Ѵٸ�, �� ���ڸ� �����. 
     * ȭ��ǥ�� �Է��� '<'�� '>'�� �־�����. �̶��� Ŀ���� ��ġ�� ������ �� �ִٸ�, ���� �Ǵ� ���������� 1��ŭ �����δ�. 
     * ������ ���ڴ� ��й�ȣ�� �Ϻ��̴�. ����, ���߿� �齺���̽��� ���ؼ� ���� ���� �ִ�. 
     * ���� Ŀ���� ��ġ�� ���� �������� �ƴ϶��, Ŀ�� �� Ŀ�� �����ʿ� �ִ� ��� ���ڴ� ���������� �� ĭ �̵��Ѵ�.
     * 
	 * */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();

		int n = Integer.parseInt(br.readLine()); // �� �κп��� ��� ��Ÿ�� ��������..
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
