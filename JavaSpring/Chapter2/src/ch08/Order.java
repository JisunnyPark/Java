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
		System.out.printf("�ֹ� ���� ��ȣ : %s \n"
				+ "�ֹ� �ڵ��� ��ȣ : %s \n"
				+ "�ֹ� �� �ּ� : %s \n"
				+ "�ֹ� ��¥ : %d \n"
				+ "�ֹ� �ð� : %d \n"
				+ "�ֹ� ���� : %d \n"
				+ "�޴� ��ȣ : %s \n"
				, orderNumber, phoneNumber, address
				, orderDate, orderTime, price, menuNumber);
	}
}
