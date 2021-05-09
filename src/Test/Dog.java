package Test;

public class Dog extends Animal_0504 {
	public void sleep() {
		System.out.println(this.name+"zZZ");
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("happy");
		System.out.println(dog.name);
		dog.sleep();
	}

	
}
