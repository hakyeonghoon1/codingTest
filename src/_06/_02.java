package _06;

import java.util.*;

public class _02 {

	public int[] solution(int n, int[] arr) {
		/**
		 * 	버블정렬
		 * 	이웃하는 두 숫자를 비교하여 작은 숫자를 앞으로 놓는다.
		 * 	한 번을 다 진행하면 가장 큰 숫자가 뒤로간다.
		 * 	비교 횟수가 한 번씩 줄어든다.
		 */
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		
		return arr;
		
	}
	public static void main(String[] args) {
		_02 T = new _02();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) arr[i]=kb.nextInt();
		for(int x: T.solution(n,arr)) {
			System.out.print(x+" ");
		}
		
	
	} 
	
}
