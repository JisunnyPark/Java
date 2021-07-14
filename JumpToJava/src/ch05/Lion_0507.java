package ch05;

public class Lion_0507 extends Animal_0506 implements BarkablePredator {

	@Override
	public String getFood() {
		return "banana";
	}

	@Override
	public void bark() {
		System.out.println("으르렁");
	}

}
