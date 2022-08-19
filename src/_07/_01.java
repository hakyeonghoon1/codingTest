package _07;

import java.util.*;

public class _01 {

	public void DFS(int n) {
		/**
		 *	재귀함수
		 *	재귀함수는 스택 프레임을 사용한다.
		 *	DFS(3) -> 22 line까지 실행후 스택 최하단에 적재
		 *	DFS(2) -> 22 line까지 실행후 스택 DFS(3) 위에 적재
		 *	DFS(1) -> 22 line까지 실행후 스택 DFS(2) 위에 적재
		 *	DFS(0) -> 0으로 리턴 후 스택에서 사라짐
		 *	DFS(1) -> 다음라인 실행 후 스택에서 사라짐
		 *	DFS(2) -> 다음라인 실행 후 스택에서 사라짐	
		 *	DFS(3) -> 다음라인 실행 후 스택에서 사라짐
		 */
		if(n==0) return;
		else {
			
			DFS(n-1);
			System.out.print(n+" ");
		}
		
		
	}
	public static void main(String[] args) {
		_01 T = new _01();
		
		T.DFS(3);
			
	}
}
