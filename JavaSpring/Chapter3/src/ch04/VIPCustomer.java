package ch04;

public class VIPCustomer extends Customer {
	
	// 오버라이딩 : VIP 고객에 맞게 재정의
	double salesRatio;
	private String agentID;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
	}
	
	@Override // @ 컴파일러에게 알리는 역할 
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}

	public String getAgentID() {
		return agentID;
	}
}
