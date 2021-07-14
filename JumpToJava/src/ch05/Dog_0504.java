package ch05;

public class Dog_0504 extends Animal_0504 {
	public void sleep() {
		System.out.println(this.name+"zZZ");
	}

	public static void main(String[] args) {
		Dog_0504 dog = new Dog_0504();
		dog.setName("happy");
		System.out.println(dog.name);
		dog.sleep();
	}

	
}
