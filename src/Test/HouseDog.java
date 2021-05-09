package Test;

// 메서드 오버라이딩 : 상속 받아 동일 메서드 변경하여 구현
public class HouseDog extends Dog {
	public void sleep() {
		System.out.println(this.name+" zZZ in the house");
		
	}

	public HouseDog(String name) {
		this.setName(name);
	}
	
	public HouseDog(int type) {
		if(type == 1) {
			this.setName("puppy");
		} else if(type == 2) {
			this.setName("coco");
		}
	}
	
	// 메서드 오버로딩 : 동일 이름, 입력 항목 다른 메서드 추가
	public void sleep(int hour) {
		System.out.println(this.name+" zZZ in the house "+
				"for "+hour+" hrs");
	
	}
	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog("haha");
		System.out.println(houseDog.name);
		houseDog.sleep();
		houseDog.sleep(5);
		
		HouseDog coco = new HouseDog(2);
		System.out.println(coco.name);
		
		HouseDog puppy = new HouseDog(1);
		System.out.println(puppy.name);
	}

}
