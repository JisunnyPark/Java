package ch04;

import java.util.ArrayList;

public class ForEach_0405 {

	public static void main(String[] args) {
		
		// 평범한 for문
//		String[] numbers = {"one", "two", "three"};
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}

		// for each문
//		String[] numbers = {"one", "two", "three"};
//		for (String number : numbers) {
//			System.out.println(number);
//		}

		// ArrayList를 이용한 for each문
		ArrayList<String> numbers = new ArrayList<>();
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		
		for (String number : numbers) {
			System.out.println(number);
		}
	}
}
