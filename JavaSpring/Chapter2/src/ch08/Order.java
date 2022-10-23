package ch08;

public class Order {

	String orderNumber;
	String phoneNumber;
	String address;
	int orderDate;
	int orderTime;
	int price;
	String menuNumber;
	
	public void showOrderInfo() {
		System.out.println();
		System.out.printf("주문 접수 번호 : %s \n"
				+ "주문 핸드폰 번호 : %s \n"
				+ "주문 집 주소 : %s \n"
				+ "주문 날짜 : %d \n"
				+ "주문 시간 : %d \n"
				+ "주문 가격 : %d \n"
				+ "메뉴 번호 : %s \n"
				, orderNumber, phoneNumber, address
				, orderDate, orderTime, price, menuNumber);
	}
}
