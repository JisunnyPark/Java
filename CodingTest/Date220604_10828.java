package CodingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Date220604_10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<String> stack = new ArrayList<String>();
		int count = Integer.parseInt(br.readLine());

		for(int i = 0; i < count; i++) {
			String[] str = {};
			String command = br.readLine();
			
			if(command.startsWith("push")) {
				str = command.split(" ");
				command = str[0];
			}
			switch(command) {
				case("push") :
					stack.add(str[1]);
					break;
				case("top") :
					if(stack.size() != 0) {
						bw.write(String.valueOf(stack.get(stack.size()-1)));
					} else {
						bw.write("-1");
					}
					bw.newLine();
					bw.flush();
					break;
				case("size") :
					bw.write(String.valueOf(stack.size()));
					bw.newLine();
					bw.flush();
					break;
				case("empty") :
					if(stack.isEmpty()) {
						bw.write("1");
					} else {
						bw.write("0");
					}
					bw.newLine();
					bw.flush();
					break;
				case("pop") :
					if(stack.isEmpty()) {
						bw.write("-1");
					} else {
						bw.write(String.valueOf(stack.get(stack.size()-1)));
						stack.remove(stack.size()-1);
					}
					bw.newLine();
					bw.flush();
					break;
			}
		}

	}

}
