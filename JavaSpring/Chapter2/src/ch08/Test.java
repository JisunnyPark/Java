package ch08;

public class Test {

	public static void main(String[] args) {
		// Ŭ���� �̿��� ��ü ����
		Person person = new Person();
		
		person.age = 37;
		person.gender = "����";
		person.height = 180;
		person.weight = 78;
		person.name = "Tomas";
		
		person.showInfo();
		
		// ������ �̿��� ��ü ����
		Person person2 = new Person(165, 50, "����", "��", 30);
		
		person2.showInfo();
		
		
		// ------
		
		Order order = new Order();
		order.address = "����� ������ ���� 111-333";
		order.menuNumber = "0003";
		order.orderDate = 20201102;
		order.orderTime = 130258;
		order.price = 35000;
		order.phoneNumber = "01023450001";
		order.orderNumber = "202011020003";
		
		order.showOrderInfo();
	}

}
