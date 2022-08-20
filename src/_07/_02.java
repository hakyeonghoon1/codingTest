package _07;

import java.util.*;

public class _02 {

	public void DFS(int n) {
		/**
		 *	이진수 출력 재귀함수
		 */
		if(n==0) return;
		else {
			
			DFS(n/2);
			System.out.print(n%2+" ");
		}
		
		
	}
	public static void main(String[] args) {
		_02 T = new _02();
		
		T.DFS(11);
			
	}
}
