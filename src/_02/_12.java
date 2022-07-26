package _02;

import java.util.Scanner;


public class _12 {

	public int solution(int n,int m, int[][] arr) {
		
		int answer= 0;
		
		/*
		 * (i,j) i가 j의 멘토가 될 수 있는가?
		 * arr[k][s] == i 이면 pi = s
		 * arr[k][s] == j 이면 pj = s
		 * 
		 * pi<pj 이면 cnt++
		 */
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				int cnt=0;
				for(int k=0;k<m;k++) {	//k는 테스트 번호
					int pi=0,pj=0;
					for(int s=0;s<n;s++) {	//s는 등수
						if(arr[k][s]==i) pi=s;
						if(arr[k][s]==j) pj=s;
					}
					if(pi<pj) cnt++;
				}
				if(cnt==m) {
					answer++;
				}
			}	
		}
		
		return answer;
		
	}
	public static void main(String[] args) {
		_12 T = new _12();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();
		
		int[][] arr = new int[n][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]= kb.nextInt();	
			}
		}

		System.out.print(T.solution(n,m,arr));
		
	}
	
}
