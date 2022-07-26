package _02;

import java.util.Scanner;

public class _08 {
	
	public int[] solution(int n,int[] arr) {
		
		int[] answer= new int[n];
		
		int cnt = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) cnt++;
			}
			answer[i]=cnt+1;
			cnt=0;
		}
		
		return answer;
		
	}
	public static void main(String[] args) {
		_08 T = new _08();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= kb.nextInt();
		}
		
		for(int x :T.solution(n,arr)) {
			System.out.print(x+" ");
		}

	}
	
}
