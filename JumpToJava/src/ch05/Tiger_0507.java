package ch05;

public class Tiger_0507 extends Animal_0506 implements Predator_0506, Barkable_0507 {

	@Override
	public String getFood() {
		return "apple";
	}

	@Override
	public void bark() {
		System.out.println("어흥");
	}

}
