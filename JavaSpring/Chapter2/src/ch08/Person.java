package ch08;

public class Person {
	
	int height;
	int weight;
	String gender;
	String name;
	int age;
	
	public Person() { }
	
	public Person(int height, int weight, String gender, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.printf("Ű�� %d �̰� �����԰� %d ų���� %s�� �ֽ��ϴ�."
				+ "�̸��� %s �̰� ���̴� %d���Դϴ�. \n"
				, height, weight, gender, name, age);
	}
}
