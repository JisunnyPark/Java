package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerName("�̼���");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCumstomerInfo() + " " + price);
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("������");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		// Customer�� �޼������� ����� �޾ұ� ������ ��� ����
		System.out.println(customerKim.showCumstomerInfo() + " " + price);
	
		/*
		 * Customer vc = new VIPCustomer(12345, "nonmae");
		 * 
		 * --> ����ȯ O -> �� ��� Customer�� ��ɸ� ��� ����
		 * ������ Sysout(vc.calcPrice(1000)); �� ���� ��ų ���
		 * VIPCustomer�� calcPrice()�� ������ �޾� 900 ��µ�
		 * */
	}
}
