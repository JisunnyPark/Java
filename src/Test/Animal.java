package Test;

public class Animal {
	String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Animal cat = new Animal();
		Animal dog = new Animal();
		
		cat.setName("지지");
		dog.setName("호호");
		System.out.println(cat.name);
		System.out.println(dog.name);
	}

}
