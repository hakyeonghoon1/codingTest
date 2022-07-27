package _03;

import java.util.*;

public class _03 {

	public int solution(int n, int m, int[] arr) {
		
		
		
		// 슬라이딩 윈도우
		int sum=0;
		for(int i=0;i<m;i++) {
			sum += arr[i];
		}
		int answer = sum;

		for(int i=0;i<n-m;i++) {
			sum+=(arr[i+m]-arr[i]);
			answer=Math.max(answer, sum);
		}

		return answer;
		
	}
	public static void main(String[] args) {
		_03 T = new _03();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		
		System.out.print(T.solution(n,m,arr));
		
	
	} 
	
}
