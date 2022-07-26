package _02;

import java.util.Scanner;

public class _02 {

	public int solution(int n, int[] arr) {
		
		int answer= 0;
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				answer++;
				max=arr[i];
			}
		}
		return answer;
		
	}
	public static void main(String[] args) {
		_02 T = new _02();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}

		System.out.print(T.solution(n,arr));
	
	}
	
}
