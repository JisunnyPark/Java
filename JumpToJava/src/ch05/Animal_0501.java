package ch05;

/*
 * 과자틀 → 클래스 (Class)
 * 과자틀에 의해서 만들어진 과자들 → 객체 (Object)
 * 
 * */
public class Animal_0501 {
	String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Animal_0501 cat = new Animal_0501();
		Animal_0501 dog = new Animal_0501();
		
		cat.setName("지지");
		dog.setName("호호");
		System.out.println(cat.name);
		System.out.println(dog.name);
	}

}
