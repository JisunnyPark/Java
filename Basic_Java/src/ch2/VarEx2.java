package ch2;

public class VarEx2 {

	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp = 0;
		
		System.out.println("x:" + x +  " y:" + y);
		
		tmp = x; // 10
		x = y; // 20
		y = tmp; // 10
		
		System.out.println("x:" + x + " y:" + y);

		// --> 변수 tmp 생성하여 x값 저장
		// 	   y값을 x에 저장
		//	   tmp값을 y에 저장하여 두 변수의 값 교환할 수 있다.
	}
}
