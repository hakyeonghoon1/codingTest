package _02;

import java.util.Scanner;

public class _04 {

	public int[] solution(int n) {
		
		
		/* 손코딩
		 *  
		int a=1, b=1, c;
		System.out.print(a+" "+b+" ");
		for(int i=2; i<n;i++){
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		 
		 */
		int[] answer= new int[n];

		answer[0] =1;
		answer[1] =1;

		for(int i=2;i<n;i++) {
			answer[i]=answer[i-1]+answer[i-2];
		}
		
		return answer;
		
	}
	public static void main(String[] args) {
		_04 T = new _04();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();


		for(int x : T.solution(n)) {
			System.out.print(x+" ");
		}
		
	}
	
}
