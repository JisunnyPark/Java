package ch05;

public class ZooKeeper_0506 {
	public void feed(Predator_0506 predator) {
		System.out.println("feed " + predator.getFood());
	}
	
	public static void main(String[] args) {
		ZooKeeper_0506 zooKeeper = new ZooKeeper_0506();
		Tiger_0506 tiger = new Tiger_0506();
		Lion_0506 lion = new Lion_0506();
		Crocodile_0506 crocodile = new Crocodile_0506();
		
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		zooKeeper.feed(crocodile);
		
	}
}
