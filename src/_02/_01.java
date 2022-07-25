package _02;

import java.util.ArrayList;
import java.util.Scanner;

public class _01 {

	public ArrayList<Integer> solution(int n, int[] arr) {
		
		ArrayList<Integer> answer= new ArrayList<>();
		
		/* 내가 푼 풀이
		answer.add(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]<arr[i]) answer.add(arr[i]);
		}
		*/
		return answer;
		
	}
	public static void main(String[] args) {
		_01 T = new _01();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}

		for(int x : T.solution(n,arr)) {
			System.out.print(x+" ");
		}
	
	} 
	
}
