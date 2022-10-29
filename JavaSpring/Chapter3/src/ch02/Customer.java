package ch02;

public class Customer {
	
	// @ Customer
	// 1. 고객의 정보는 중요하니까 private
	// 2. VIP 고객을 추가해야하는 경우 한 클래스에 추가하여 다 구현하면
	// 일일이 코드를 추가/수정하면서 소스가 지저분해짐 + 관리 용이성 X
	// --> 그러므로 따로 클래스를 생성하는 것이 나음
	// @ VIPCustomer
	// 3. VIPCustomer 클래스를 생성하니 Customer 클래스와 동일한 메서드를 재생성하게 됨
	// --> 상속의 필요성
	// 4. Customer 생성자를 이용하여 private의 customerGrade 변수를 사용하려하니 오류 발생
	// --> 상속의 경우 protected를 이용 -->  private -> protected로 변경
	
	// private int customerID;
	protected int customerID;
	// private String customerName;
	protected String customerName;
	// private String customerGrade;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCumstomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}
