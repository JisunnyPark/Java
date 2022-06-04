package CodingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Date220604_9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		for(int i = 0; i < count; i++) {
			int result = 0;
			boolean result2 = true;
			String str = br.readLine();
			for(int j = 0; j < str.length(); j++) {
				char s = str.charAt(j);
				if(s == '(') {
					result++;
				} else {
					if(result == 0) {
						result2 = false;
					}
					result--;
				}
 			}
			if(result == 0 && result2 == true) {
				bw.write("YES"); 
			} else {
				bw.write("NO");
			}
			bw.newLine();
			bw.flush();
		}
	}
}
