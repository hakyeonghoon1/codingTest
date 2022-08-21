package _07;

import java.util.*;

public class _03 {

	public int DFS(int n) {
		/**
		 *	재귀를 활용한 팩토리얼
		 */
		if(n==1) return 1;
		else {
			
			return n*DFS(n-1);
			
		}
		
		
	}
	public static void main(String[] args) {
		_03 T = new _03();
		
		System.out.println(T.DFS(5));
		
			
	}
}
