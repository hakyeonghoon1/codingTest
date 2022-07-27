package _03;

import java.util.ArrayList;
import java.util.Scanner;

public class _01 {

	public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
		
		//퀵 정렬 O(nlogn)는 너무 복잡해진다. 이걸로 풀지 말아라!!
		//O(n) 으로 풀어라
		ArrayList<Integer> answer = new ArrayList<>();
		
		int p1=0, p2=0;	//포인터라고 생각하면 된다.
		while(p1<n && p2<m) {
			if(arr1[p1]<arr2[p2]) answer.add(arr1[p1++]);
			else answer.add(arr2[p2++]);
		}
		while(p1<n) answer.add(arr1[p1++]);
		while(p2<m) answer.add(arr2[p2++]);
		
		return answer;
		
	}
	public static void main(String[] args) {
		_01 T = new _01();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] arr1 = new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=kb.nextInt();
		}
		
		int m = kb.nextInt();
		int[] arr2 = new int[m];
		for(int j=0;j<m;j++) {
			arr2[j]=kb.nextInt();
		}

		for(int x : T.solution(n,m,arr1,arr2)) {
			System.out.print(x+" ");
		}
	
	} 
	
}
