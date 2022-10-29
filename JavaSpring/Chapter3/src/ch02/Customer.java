package ch02;

public class Customer {
	
	// @ Customer
	// 1. ���� ������ �߿��ϴϱ� private
	// 2. VIP ���� �߰��ؾ��ϴ� ��� �� Ŭ������ �߰��Ͽ� �� �����ϸ�
	// ������ �ڵ带 �߰�/�����ϸ鼭 �ҽ��� ���������� + ���� ���̼� X
	// --> �׷��Ƿ� ���� Ŭ������ �����ϴ� ���� ����
	// @ VIPCustomer
	// 3. VIPCustomer Ŭ������ �����ϴ� Customer Ŭ������ ������ �޼��带 ������ϰ� ��
	// --> ����� �ʿ伺
	// 4. Customer �����ڸ� �̿��Ͽ� private�� customerGrade ������ ����Ϸ��ϴ� ���� �߻�
	// --> ����� ��� protected�� �̿� -->  private -> protected�� ����
	
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
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
}
