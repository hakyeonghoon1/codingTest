package _02;

import java.util.Scanner;

public class _10 {
	int[] dx = {-1,0,1,0};
	int[] dy = {0,1,0,-1};
	public int solution(int n,int[][] arr) {
		
		int answer= 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				boolean flag = true;
				for(int k=0; k<4;k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j] ) {
						flag=false;
						break;
					}
				}
				if(flag) answer++;
			}
		}
		
		/* 내가 푼 풀이
		int cnt =0;
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<n+1;j++) {

				if(arr[i][j]>arr[i-1][j] && arr[i][j]>arr[i+1][j]
					&& arr[i][j]>arr[i][j-1] && arr[i][j]>arr[i][j+1]) {
					cnt++;
				}
			}

		}
		answer=cnt;
		*/
		return answer;
		
	}
	public static void main(String[] args) {
		_10 T = new _10();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		
		
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]= kb.nextInt();	
			}
		}
		/*	내가 푼 풀이
		int[][] arr = new int[n+2][n+2];
		

		for(int i=1;i<n+1;i++) {
			for(int j=1;j<n+1;j++) {
				arr[i][j]= kb.nextInt();	
			}
		}
		*/	
		System.out.print(T.solution(n,arr));
		
	}
	
}
