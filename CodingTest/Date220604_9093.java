package CodingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Date220604_9093 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < count; i++) {
			String[] str = br.readLine().split(" ");
			for(int j = 0; j < str.length; j++) {
				StringBuffer sb = new StringBuffer(str[j]);
				bw.write(sb.reverse() + " ");
			}
			bw.newLine();
			bw.flush();
		}
	}
}
