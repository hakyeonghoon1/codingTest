package _07;

import java.util.*;

public class _06 {
	static int n;
	static int[] ch;
	public void DFS(int L) {
		/**
		 *	부분집합 구하기(DFS 상태트리)
		 */
		
		if(L==n+1) {
			String tmp="";
			for(int i=1; i<=n;i++){
				if(ch[i]==1) tmp+=(i+" ");
			}
			
			if(tmp.length()>0) System.out.println(tmp);
		}
		else {
			ch[L]=1;
			DFS(L+1);
			ch[L]=0;
			DFS(L+1);
		}
		
		
		
	}
	public static void main(String[] args) {
		_06 T = new _06();
		n=3;
		ch= new int[n+1];
		T.DFS(1);
			
	}
}
