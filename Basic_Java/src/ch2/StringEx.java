package ch2;

public class StringEx {

	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + ""); // 14
		System.out.println("" + 7 + 7); // 77 
		// 결합 순서에 따라 결과가 달라진다는 것에 주의!!

	}

}
