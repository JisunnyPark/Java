package CodingTest;

public class Date220409 {
	/*
	 * 완주하지 못한 선수(Level1)
	 * 
	 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
	 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
	 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
	 * 
	 * 	participant											completion									return
	 *	["leo", "kiki", "eden"]								["eden", "kiki"]							"leo"
	 *	["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
	 *	["mislav", "stanko", "mislav", "ana"]				["stanko", "ana", "mislav"]					"mislav"
	 *
	 *	채점 결과
	 *  정확성: 10.0
	 *  효율성: 0.0
	 *  합계: 10.0 / 100.0
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