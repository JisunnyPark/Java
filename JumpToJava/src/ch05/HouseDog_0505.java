package ch05;

public class HouseDog_0505 extends Dog_0505 {
	public HouseDog_0505(String name) { // 생성자 오버로딩
		this.setName(name);
	}
	
	public HouseDog_0505(int type) {
		if (type == 1) {
			this.setName("yorkshire");
		} else if (type == 2) {
			this.setName("bulldog");
		}
	}
	
	// -----
	public void sleep() { // 메서드 오버로딩
		System.out.println(this.name+" zzz in the house");
	}
	
	public void sleep(int hour) {
		System.out.println(this.name+" zzz in the house for " + hour + " hours");
	}
	
	public static void main(String[] args) {
//		HouseDog_0505 houseDog = new HouseDog_0505();
//		houseDog.setName("happy");
		
		HouseDog_0505 houseDog = new HouseDog_0505("happy");
		// 생성자 호출 시 문자열을 전달해야 한다.
		houseDog.sleep();
		houseDog.sleep(3);
		
		// -----
		HouseDog_0505 happy = new HouseDog_0505("happy");
		HouseDog_0505 yorkshire = new HouseDog_0505(1);
		System.out.println(happy.name);
		System.out.println(yorkshire.name);

	}

}
