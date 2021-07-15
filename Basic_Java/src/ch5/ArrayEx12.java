package ch5;

public class ArrayEx12 {

	public static void main(String[] args) {
		String[] names = {"kim", "park", "lee"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("name[" + i + "] = " + names[i]);
		}
		
		String tmp = names[2];
		names[0] = "yu";
		
		for (String str : names) {
			System.out.println(str);
		}

	}

}
