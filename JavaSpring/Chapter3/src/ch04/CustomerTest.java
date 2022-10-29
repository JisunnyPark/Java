package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCumstomerInfo() + " " + price);
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		// Customer의 메서드지만 상속을 받았기 때문에 사용 가능
		System.out.println(customerKim.showCumstomerInfo() + " " + price);
	
		/*
		 * Customer vc = new VIPCustomer(12345, "nonmae");
		 * 
		 * --> 형변환 O -> 이 경우 Customer의 기능만 사용 가능
		 * 하지만 Sysout(vc.calcPrice(1000)); 을 실행 시킬 경우
		 * VIPCustomer의 calcPrice()의 영향을 받아 900 출력됨
		 * */
	}
}
