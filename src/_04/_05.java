package _04;

import java.util.*;

public class _05 {

	public int solution(int n, int k, int[] arr) {
		
		int answer=0;
		/**
		 * TreeSet 이진트리 = 중복제거 + 정렬까지 맞춰
		 * 
		 * 기타 메서드
		 * 1.remove(143): 143을 지운다.
		 * 2.size() 	: 원소의 갯수
		 * 3.first		: 제일 앞의 값
		 * 4.last		: 마지막에 있는 값 
		 */
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int l=j+1;l<n;l++) {
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt =0;
		for(int x: Tset) {
			cnt++;
			if(cnt==k) return x;
			else answer=-1;
		}
		
			
		return answer;
		
	}
	public static void main(String[] args) {
		_05 T = new _05();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}

		System.out.print(T.solution(n, k, arr));
		
	} 
	
}
