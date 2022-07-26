package _02;

import java.util.Scanner;

public class _11 {
	
	public int solution(int n,int[][] arr) {
		
		int answer=0, max=Integer.MIN_VALUE;
		
		for(int i=1;i<=n;i++) {
			int cnt=0;
			for(int j=1;j<=n;j++) {
				for(int k=1;k<=5;k++) {
					if(arr[i][k]==arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt>max) {
				max=cnt;
				answer=i;
			}
		}
		
		/* 내가 푼 풀이 (답은 나오지만, 채점사이트에서 정답인정 안됨...)
		int answer= 0;
		String[] student = new String[n];
		int[] studentResult = new int[n];
		int finalResult =0;
		for(int i=0;i<n;i++) {
			student[i]="";
		}
		for(int j=0;j<5;j++) {	
			for(int k=0;k<n;k++) {
				for(int i=0;i<n;i++) {					
					if(i!=k && arr[i][j] == arr[k][j]) {						
						student[k] += i;
					}
				}
			}		
		}
		
		for(int i=0;i<n;i++) {
			char[] s = student[i].toCharArray();
			
			for(int j=0;j<s.length;j++) {

				if(Character.isDigit(s[j]) && student[i].indexOf(student[i].charAt(j))==j) studentResult[i]++;
			}
			if(finalResult<studentResult[i]) {
				finalResult=studentResult[i];
				
				answer=i+1;
			}
		}
		
		*/
		return answer;
		
	}
	public static void main(String[] args) {
		_11 T = new _11();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[][] arr = new int[n+1][6];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=5;j++) {
				arr[i][j]= kb.nextInt();	
			}
		}
		
		/*
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[][] arr = new int[n][5];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j]= kb.nextInt();	
			}
		}
		*/
		System.out.print(T.solution(n,arr));
		
	}
	
}
