package _02;

import java.util.Scanner;

public class _05 {

	public int solution(int n) {
		
		int answer= 0;
		int[] cnt = new int[n+1];
		for(int i=2;i<=n;i++) {
			if(cnt[i]==0) {
				answer++;
				for(int j=i; j<=n; j=j+i) cnt[j]=1;
			}
		}
		
		return answer;
		
	}
	public static void main(String[] args) {
		_05 T = new _05();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		System.out.print(T.solution(n));
				
	}
	
}
