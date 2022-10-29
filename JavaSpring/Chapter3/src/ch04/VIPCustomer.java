package ch04;

public class VIPCustomer extends Customer {
	
	// �������̵� : VIP ���� �°� ������
	double salesRatio;
	private String agentID;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
	}
	
	@Override // @ �����Ϸ����� �˸��� ���� 
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}

	public String getAgentID() {
		return agentID;
	}
}
