package CodingTest;

/*

로또의 최고 순위와 최저 순위

-- 결과 : 정답

class Solution {

    public int[] solution(int[] lottos, int[] win_nums) {
		int[] validNums = new int[10];
		
		int hitCnt = 0;
		int zeroCnt = 0;
		
		for(int l : lottos) {
			if(l == 0) { zeroCnt++; } 
			else {
				validNums[hitCnt] = l;
				hitCnt++;
			}
		}
		
		int hitCount = 0;
		for(int num : validNums) {
			if(num != 0) {
				for(int w : win_nums) {
					if(num == w) {
						hitCount++;
					}
				}
			}
		}
		
        int[] score = {hitCount+zeroCnt, hitCount};
        for(int i = 0; i < score.length; i++) {
	        if(score[i] == 6) {
	        	score[i] = 1;
	        } else if(score[i] == 5) {
	        	score[i] = 2;
	        } else if(score[i] == 4) {
	        	score[i] = 3;
	        } else if(score[i] == 3) {
	        	score[i] = 4;
	        } else if(score[i] == 2) {
	        	score[i] = 5;
	        } else {
	        	score[i] = 6;
	        }
        }
        
        return score;
    }
}
*/

public class Date220416 {

	public static void main(String[] args) {
		
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		int[] validNums = new int[10];
		
		int hitCnt = 0;
		int zeroCnt = 0;
		
		for(int l : lottos) {
			if(l == 0) { zeroCnt++; } 
			else {
				validNums[hitCnt] = l;
				hitCnt++;
			}
		}
		
		int hitCount = 0;
		for(int num : validNums) {
			if(num != 0 ) {
				for(int w : win_nums) {
					if(num == w) {
						hitCount++;
					}
				}
			}
		}
		
        int[] score = {hitCount+zeroCnt, hitCount};
        for(int i = 0; i < score.length; i++) {
	        if(score[i] == 6) {
	        	score[i] = 1;
	        } else if(score[i] == 5) {
	        	score[i] = 2;
	        } else if(score[i] == 4) {
	        	score[i] = 3;
	        } else if(score[i] == 3) {
	        	score[i] = 4;
	        } else if(score[i] == 2) {
	        	score[i] = 5;
	        } else {
	        	score[i] = 6;
	        }
        }
        
		for(int r : score) {
			System.out.println(r);
		}	
	}
}
