package CodingTest;

public class Date220409 {
	/*
	 * �������� ���� ����(Level1)
	 * 
	 * ������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.
	 * �����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, 
	 * �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
	 * 
	 * 	participant											completion									return
	 *	["leo", "kiki", "eden"]								["eden", "kiki"]							"leo"
	 *	["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
	 *	["mislav", "stanko", "mislav", "ana"]				["stanko", "ana", "mislav"]					"mislav"
	 *
	 *	ä�� ���
	 *  ��Ȯ��: 10.0
	 *  ȿ����: 0.0
	 *  �հ�: 10.0 / 100.0
	 **/
	
	class Solution {
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        String tmp = "";
	        for(String p : participant) {
	            if(answer.indexOf(p) != -1) {
	             tmp = p;  
	            } else {
	             answer += p;    
	            }
	        }
	        
	        for(String c : completion) {
	            if(answer.indexOf(c) != -1) {
	                answer = answer.replace(c, "");
	            }
	        }
	        return answer+tmp;
	    }
	}
}