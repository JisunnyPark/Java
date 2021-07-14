package ch06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



public class StreamTest {
	public static void main(String[] args) throws Exception {
		InputStream in = System.in; // 콘솔창에 입력 가능
		// 알파벳 a 입력시 아스키 코드 값으로 변환 후 출력
		// 하지만 abc를 입력한다면?
//		int a;
//		a = in.read(); // read는 1바이트만 읽기 때문에 abc 값을 출력 못함
//		
//		int b;
//		int c;
//		
//		b = in.read();
//		c = in.read();
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c); // abc 입력 시 97 98 99 출력 가능
		
		// 개선된 방법
//		byte[] a = new byte[3];
//		in.read(a);
//		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
		
		// 더 개선된 방법 (문자열 입력한 그대로 출력 됨 --> 하지만 3바이트 까지만 가능)
//		InputStreamReader reader = new InputStreamReader(in);
//		char[] a = new char[3];
//		reader.read(a);
//		
//		System.out.println(a);
		
		// 더더 개선된 방법 (바이트 값 상관없이 문자열 출력)
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);
		
		String a = br.readLine();
		System.out.println(a);
		
		/* 
		  ==> 
		  InputStream - byte
		  InputStreamReader - character
		  BufferedReader - String
		*/
	}
}


























