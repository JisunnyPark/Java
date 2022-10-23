package ch08;

public class Test {

	public static void main(String[] args) {
		// 클래스 이용한 객체 구현
		Person person = new Person();
		
		person.age = 37;
		person.gender = "남성";
		person.height = 180;
		person.weight = 78;
		person.name = "Tomas";
		
		person.showInfo();
		
		// 생성자 이용한 객체 구현
		Person person2 = new Person(165, 50, "여성", "지", 30);
		
		person2.showInfo();
		
		
		// ------
		
		Order order = new Order();
		order.address = "서울시 강남구 역삽동 111-333";
		order.menuNumber = "0003";
		order.orderDate = 20201102;
		order.orderTime = 130258;
		order.price = 35000;
		order.phoneNumber = "01023450001";
		order.orderNumber = "202011020003";
		
		order.showOrderInfo();
	}

}
