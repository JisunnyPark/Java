package ch15;

public class Taxi {

	String taxiName;
	int money;
	
	public Taxi(String taxiName) {
		this.taxiName = taxiName;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showTaxiInfo() {
		System.out.printf("%s ������ %d �� �Դϴ�."
				, taxiName, money);
	}
}
