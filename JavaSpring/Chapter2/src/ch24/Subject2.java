package ch24;

/*
 * 1001학번 Lee와 1002학번 Kim, 두 학생이 있습니다. 
 * Lee 학생은 국어와 수학 2과목을 수강했고, Kim 학생은 국어, 수학, 영어 3 과목을 수강하였습니다.
 * Lee 학생은 국어 100점, 수학 50점입니다. 
 * Kim 학생은 국어 70점, 수학 85점, 영어 100점입니다. 
 * Student와 Subject 클래스를 만들고 ArrayList를 활용하여 두 학생의 과목 성적과 총점을 출력하세요
 * */

public class Subject2 {
	
	String subjectName;
	String subjectScore;
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectScore() {
		return subjectScore;
	}
	public void setSubjectScore(String subjectScore) {
		this.subjectScore = subjectScore;
	}
}
