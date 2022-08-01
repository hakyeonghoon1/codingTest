package _05;

import java.util.*;

public class _03 {

	public int solution(int[][] board, int[] moves) {
		
		int answer=0;
		Stack<Integer> stack = new Stack<>();
		for(int pos : moves) {
			for(int i=0;i<board.length;i++) {	//board.length => 행크기 , board[0].length 0번 행을 열 크기
				if(board[i][pos-1]!=0) {
					int tmp = board[i][pos-1];
					board[i][pos-1]=0;
					if(!stack.isEmpty() && tmp==stack.peek()) {
						answer+=2;
						stack.pop();
					}
					else {
						stack.push(tmp);
					}
					break;
				}
			}
		}
	
		return answer;
		
	}
	public static void main(String[] args) {
		_03 T = new _03();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[][] board = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]=kb.nextInt();
			}
		}
		int m= kb.nextInt();
		int[] moves= new int[m];
		for(int i=0;i<m;i++) moves[i]=kb.nextInt();
		
		System.out.print(T.solution(board,moves));
	
	} 
	
}
