package _02;

import java.util.ArrayList;
import java.util.Scanner;

public class _03 {

	public ArrayList<String> solution(int n, int[] arrA, int[] arrB) {
		
		ArrayList<String> answer= new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			if(arrA[i]==arrB[i]) {
				answer.add("D");
			} else if ((arrA[i]==1 && arrB[i]==3)||arrA[i]==2 && arrB[i]==1||arrA[i]==3 && arrB[i]==2) answer.add("A");
			else answer.add("B");
		}
		return answer;
		
	}
	public static void main(String[] args) {
		_03 T = new _03();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] arrA = new int[n];
		for(int i=0;i<n;i++) {
			arrA[i]=kb.nextInt();
		}
		
		int[] arrB = new int[n];
		for(int i=0;i<n;i++) {
			arrB[i]=kb.nextInt();
		}

		for(String x : T.solution(n,arrA, arrB)) {
			System.out.println(x);
		}
		
	}
	
}
