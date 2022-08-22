package _07;

import java.util.*;

public class _04 {
	static int[] fibo;
	public int DFS(int n) {
		/**
		 *	재귀를 활용한 피보나치 수열
		 */
		if(fibo[n]>0) return fibo[n];
		if(n==1) return fibo[n]=1;
		else if(n==2) return fibo[n]=1;
		else {	
			return fibo[n]= DFS(n-2)+DFS(n-1);
			
		}
		
		
	}
	public static void main(String[] args) {
		_04 T = new _04();
		int n = 45;
		fibo = new int[n+1];
		T.DFS(n);
		for(int i=1;i<=n;i++) System.out.print(fibo[i]+" ");
		
			
	}
}
