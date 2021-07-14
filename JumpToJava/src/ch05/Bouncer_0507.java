package ch05;

public class Bouncer_0507 {

	public void barkAnimal(Barkable_0507 animal) {
	    animal.bark();
	}
	
	public static void main(String[] args) {
		Tiger_0507 tiger = new Tiger_0507();
		Lion_0507 lion = new Lion_0507();
		
		Bouncer_0507 bouncer = new Bouncer_0507();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
	}
}
