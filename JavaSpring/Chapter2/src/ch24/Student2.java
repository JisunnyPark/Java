package ch24;

import java.util.ArrayList;

/*
 * 1001학번 Lee와 1002학번 Kim, 두 학생이 있습니다. 
 * Lee 학생은 국어와 수학 2과목을 수강했고, Kim 학생은 국어, 수학, 영어 3 과목을 수강하였습니다.
 * Lee 학생은 국어 100점, 수학 50점입니다. 
 * Kim 학생은 국어 70점, 수학 85점, 영어 100점입니다. 
 * Student와 Subject 클래스를 만들고 ArrayList를 활용하여 두 학생의 과목 성적과 총점을 출력하세요
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
			System.out.println(studentName + " 학생의 " + s.subjectName + " 점수는 " + s.subjectScore + "점 입니다.");
			total += Integer.parseInt(s.subjectScore);
		}
		
		System.out.println("총점 : " + total);
		System.out.println("==========");
	}
}
