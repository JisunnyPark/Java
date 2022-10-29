package ch24;

public class StudentSubjectTest2 {

	/*
	 * 1001학번 Lee와 1002학번 Kim, 두 학생이 있습니다. 
	 * Lee 학생은 국어와 수학 2과목을 수강했고, Kim 학생은 국어, 수학, 영어 3 과목을 수강하였습니다.
	 * Lee 학생은 국어 100점, 수학 50점입니다. 
	 * Kim 학생은 국어 70점, 수학 85점, 영어 100점입니다. 
	 * Student와 Subject 클래스를 만들고 ArrayList를 활용하여 두 학생의 과목 성적과 총점을 출력하세요
	 * */
	
	public static void main(String[] args) {
		
		Student2 studentLee = new Student2("1001", "Lee");
		Student2 studentKim = new Student2("1002", "Kim");
		
		studentLee.addScoreInfo("국어", "100");
		studentLee.addScoreInfo("수학", "50");

		studentKim.addScoreInfo("국어", "70");
		studentKim.addScoreInfo("수학", "85");
		studentKim.addScoreInfo("영어", "100");

		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
	}
}
