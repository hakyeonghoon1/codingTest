package _03;

import java.util.*;

public class _06 {

	public int solution(int n, int m, int[] arr) {
		
		int answer = 0;
		int sum=0,lt=0;
		for(int rt=0; rt<n;rt++) {
			sum +=arr[rt];
			if(sum==m) answer++;
			while(sum>=m) {
				sum-=arr[lt++];
				if(sum==m) answer++;
			}
		}
		/* // 내가 푼 풀이 (마무리처리가 제대로 되지 않은것 같다.)
		int first=0;
		int sum=arr[0];
		int p=0;
		while(p<n) {

			if(sum==m) {
				answer++;
				if(p<n)sum+=+arr[++p];
			}
			else if(sum>m) {
				sum = sum - arr[first++];
			}
			else {
				if(p<n)sum+=+arr[++p];
			}

		}
		*/
		return answer;
		
	}
	public static void main(String[] args) {
		_06 T = new _06();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		
		System.out.print(T.solution(n,m,arr));
		
	
	} 
	
}
