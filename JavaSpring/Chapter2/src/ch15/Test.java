package ch15;

public class Test {

	public static void main(String[] args) {
		Person person = new Person("Edward", 50000);
		
		Taxi taxi = new Taxi("잘 간다 택시운수");
		
		person.takeTaxi(taxi);
		
		person.showPersonInfo();
		taxi.showTaxiInfo();
		
	}

}
