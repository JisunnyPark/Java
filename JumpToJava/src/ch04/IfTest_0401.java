package ch04;

import java.util.ArrayList;

public class IfTest_0401 {
// "돈이 3000원 이상 있거나 카드가 있다면 
//	택시를 타고 그렇지 않으면 걸어가라"
	public static void main(String[] args) {
		int money = 2000;
		boolean hasCard = true;
		
		if(money >= 3000 || hasCard) {
			System.out.println("택시를 타라");
		} else {
			System.out.println("걸어가라");
		}
// "만약 주머니에 돈이 있으면 택시를 타고, 없으면 걸어가라"
		ArrayList<String>pocket = new ArrayList<>();
		pocket.add("Phone");
		pocket.add("Money");
		pocket.add("Chocolate");
		
		if(pocket.contains("Money")) {
			System.out.println("택시 타고 가라");
		} else {
			System.out.println("초콜릿 먹으면서 걸어가라");
		}
		
// "지갑에 돈이 있으면 택시를 타고, 
// 지갑엔 돈이 없지만 카드가 있으면 택시를 타고, 
// 돈도 없고 카드도 없으면 걸어가라"
		ArrayList<String>wallet = new ArrayList<>();
		wallet.add("PointCard");
		wallet.add("StudentCard");
		
		if(wallet.contains("Money")) {
			System.out.println("택시 타라");
		} else if(wallet.contains("Card")) {
			System.out.println("택시 타세요");
		} else {
			System.out.println("걸어가라");
		}
	}
}
