package ch5;

public class ArrayEx19 {

	public static void main(String[] args) {
		int[][] score = {
							{100, 100, 100}
							, {20, 20, 20}
							, {30, 30, 30}
							, {40, 40, 40}
							, {50, 50, 50}
						};
	
		// 과목별 총점
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("======================");

		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			double average = 0;
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			
			System.out.printf(" %d ", i+1);
			
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%3d ", score[i][j]);
			}
			
			average = sum / (double) score[i].length;
			System.out.printf("%3d %.1f %n", sum, average);
		}	
		System.out.println("======================");
		System.out.printf("총점:%3d %3d %3d", korTotal, engTotal, mathTotal);
	}

}






















