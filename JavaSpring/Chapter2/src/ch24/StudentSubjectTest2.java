package ch24;

public class StudentSubjectTest2 {

	/*
	 * 1001�й� Lee�� 1002�й� Kim, �� �л��� �ֽ��ϴ�. 
	 * Lee �л��� ����� ���� 2������ �����߰�, Kim �л��� ����, ����, ���� 3 ������ �����Ͽ����ϴ�.
	 * Lee �л��� ���� 100��, ���� 50���Դϴ�. 
	 * Kim �л��� ���� 70��, ���� 85��, ���� 100���Դϴ�. 
	 * Student�� Subject Ŭ������ ����� ArrayList�� Ȱ���Ͽ� �� �л��� ���� ������ ������ ����ϼ���
	 * */
	
	public static void main(String[] args) {
		
		Student2 studentLee = new Student2("1001", "Lee");
		Student2 studentKim = new Student2("1002", "Kim");
		
		studentLee.addScoreInfo("����", "100");
		studentLee.addScoreInfo("����", "50");

		studentKim.addScoreInfo("����", "70");
		studentKim.addScoreInfo("����", "85");
		studentKim.addScoreInfo("����", "100");

		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
	}
}
