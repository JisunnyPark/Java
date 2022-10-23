package ch02;

public class BinarySearchProblem {

	public static void main(String[] args) {
		/**
		 * 02. 정렬된 수에서 하나의 수의 위치 찾기
		 * 여러 개의 수가 정렬된 순서로 있을 때 특정한 수를 찾는 방법
		 * 단순 반복문을 이용하면 수의 개수에 따라 비교 횟수가 증가하는 O(n)의 수행이 이루어짐
		 * ★ 수가 정렬된 상태에서는 이진 탐색(binary search)을 활용하면 ★ 
		 * 매번 비교되는 요소의 수가 절반으로 감소될 수 있으므로 O(logN)의 수행으로 원하는 수를 찾을 수 있음
		 * 수의 예 : [12, 25, 31, 48, 54, 66, 70, 83, 95, 108]
		 * 83의 위치를 찾아보세요
		 * 88의 위치를 찾아보세요
		 * 
		 * 수가 정렬된 상태이므로 중간의 값을 하나 선택한다. 
		 * 찾으려는 값이 그보다 크면 범위를 오른쪽으로 그보다 작으면 범위를 왼쪽으로 좁힐수 있다.
		 * 한번 비교 할때 마다 1/2씩 범위가 좁혀진다.
		 */
		
		int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
		int target = 83;
		int left = 0;
		int right = numbers.length-1;
		int mid = (left + right)/2;
		int temp = numbers[mid];
		boolean find = false;
		
		while(left <= right) { // while(true)랑 같은 의미아닌가?
			if(target == temp) {
				find = true;
				break;
			} else if(target > temp) {
				left = mid+1;
			} else {
				right = mid-1;
			}
			mid = (left + right)/2;
			temp = numbers[mid]; 
		}
		
		if(find) {
			mid++;
			System.out.println("찾는 수의 위치는 " + mid + "번째 입니다.");
		} else {
			System.out.println("찾는 수가 없습니다.");
		}
		
		/*
		 * 나의 풀이
		 * 잘못된 점 : 
		 * 이미 오름차순으로 정렬되어 있는 수를 굳이 index 0부터 하나하나 비교할 필요 없음
		 * 배열의 중간 값을 기준으로 up&down 게임처럼 처리 필요
		 * 
		 * + 정렬이 안되어있다면??
		 * → 다음 강의 정렬 문제 참고해서 풀어보기
		 */
		
//		int[] num = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
//		int n = 83;
//		
//		for(int i=0; i<num.length; i++) {
//			if(n == num[i]) {
//				System.out.printf("%d의 위치 : %d", n, i);
//			}
//		}	
	}

}
