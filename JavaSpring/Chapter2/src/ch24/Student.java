package ch24;

import java.util.ArrayList;

/*
 * 1001학번 Lee와 1002학번 Kim, 두 학생이 있습니다. 
 * Lee 학생은 국어와 수학 2과목을 수강했고, Kim 학생은 국어, 수학, 영어 3 과목을 수강하였습니다.
 * Lee 학생은 국어 100점, 수학 50점입니다. 
 * Kim 학생은 국어 70점, 수학 85점, 영어 100점입니다. 
 * Student와 Subject 클래스를 만들고 ArrayList를 활용하여 두 학생의 과목 성적과 총점을 출력하세요
 * */

public class Student {

	int studentId;
	String studentName;
	
	ArrayList<Subject> subjectList;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int point) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(point);
		
		subjectList.add(subject);
	}
	
	public void showScoreInfo() {
		int total = 0;
		
		for(Subject subject : subjectList) {
			
			total += subject.getScorePoint();
			System.out.println(studentName + "학생의 " + subject.getName() + " 과목의 성적은 " + subject.getScorePoint() + "입니다.");
		}
		
		
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
}
