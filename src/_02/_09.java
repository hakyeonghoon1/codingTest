package _02;

import java.util.Scanner;

public class _09 {
	
	public int solution(int n,int[][] arr) {
		
		int answer= 0;
		
		int sum1 = 0;
		int sum2 = 0;
		int cross1 =0;
		int cross2 =0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {

				sum1 += arr[i][j];
				sum2 += arr[j][i];
				if(i==j)cross1 += arr[i][j];
				if(i+j==n-1)cross2 += arr[i][j];
				
			}
			if(sum1>answer) answer=sum1;
			if(sum2>answer) answer=sum2;
			if(cross1>answer) answer=cross1;
			if(cross2>answer) answer=cross2;
			
			sum1=0;
			sum2=0;

		}

		return answer;
		
	}
	public static void main(String[] args) {
		_09 T = new _09();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]= kb.nextInt();	
			}
		}
			
		System.out.print(T.solution(n,arr));
		
	}
	
}
