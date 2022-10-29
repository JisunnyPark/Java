package ch24;

import java.util.ArrayList;

/*
 * 1001�й� Lee�� 1002�й� Kim, �� �л��� �ֽ��ϴ�. 
 * Lee �л��� ����� ���� 2������ �����߰�, Kim �л��� ����, ����, ���� 3 ������ �����Ͽ����ϴ�.
 * Lee �л��� ���� 100��, ���� 50���Դϴ�. 
 * Kim �л��� ���� 70��, ���� 85��, ���� 100���Դϴ�. 
 * Student�� Subject Ŭ������ ����� ArrayList�� Ȱ���Ͽ� �� �л��� ���� ������ ������ ����ϼ���
 * */

public class Student2 {
	
	String studentId;
	String studentName;
	ArrayList<Subject2> subjectList;
	
	public Student2(String studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();
	}
	
	public void addScoreInfo(String name, String score) {
		Subject2 s = new Subject2();
		s.setSubjectName(name);
		s.setSubjectScore(score);
		
		subjectList.add(s);
	}

	public void showScoreInfo() {
		int total = 0;
		for(Subject2 s : subjectList) {
			System.out.println(studentName + " �л��� " + s.subjectName + " ������ " + s.subjectScore + "�� �Դϴ�.");
			total += Integer.parseInt(s.subjectScore);
		}
		
		System.out.println("���� : " + total);
		System.out.println("==========");
	}
}
