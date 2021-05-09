package Test;

public class Test_0502 {

	// 1. 평범한 메서드
	public int sum(int a, int b) {
		return a+b;
		
	}
	
	// 2. 입력 값이 없는 메서드
	public String say() {
		return "Hi~~";
	}
	
	// 3. 리턴 값이 없는 메서드
	public void sum2(int a, int b) {
		System.out.println(a+"와 "+b+"의 합 : "+(a+b));
	}
	
	// 4. 입력 값도 리턴 값도 없는 메서드
	public void say2() {
		System.out.println("Hi~~~2");
	}
	
	public static void main(String[] args) {
			
		int a = 3;
		int b = 4;
		
		Test_0502 test = new Test_0502();
		int c = test.sum(a, b);
		
		System.out.println(c);
	
		String d = test.say();
		
		System.out.println(d);
	
		test.sum2(a, b);
	
		test.say2();
	
	
	}
}
