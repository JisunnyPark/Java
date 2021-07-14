package ch05;

//class Updater {
//	public void update(int count) {
//		count++;
//	}
//}

class Updater {
	public void update(Counter_0503 counter) {
		counter.count++;
	}
}

public class Counter_0503 {
	int count = 0; // 객체 변수
	
	public static void main(String[] args) {
		Counter_0503 myCounter = new Counter_0503();
		System.out.println("before update : " + myCounter.count); // 기존 0 -> 0 출력
		Updater myUpdater = new Updater();
		myUpdater.update(myCounter);
		System.out.println("after update : " + myCounter.count); // 기존 0 -> 1 출력
	}
}
