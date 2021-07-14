package ch03;

import java.util.Arrays;

/*
 *  홀수 10까지 배열
 *  weeks
 *  배열 생성 후 값 대입(월~수)
 *  수만 출력, 길이 출력
 *  
 */
public class Array_0306 {

	public static void main(String[] args) {
		int[] odd = {1,3,5,7,9};
		String[] week = {"월","화","수"};
			System.out.println(Arrays.toString(week));

		System.out.println(week);
		
		String[] weeks = new String[3];
		weeks[0] = "월";
		weeks[1] = "화";
		weeks[2] = "수";
		System.out.println(Arrays.toString(weeks));
		System.out.println(weeks[2]);
		System.out.println(weeks.length);
		
}
}
