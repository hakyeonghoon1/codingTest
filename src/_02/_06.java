package _02;

import java.util.ArrayList;
import java.util.Scanner;

public class _06 {

	public boolean isPrime(int num) {
		if(num==1) return false;
		for(int i=2;i<num;i++) {
			if(num%i==0) return false;	//i부터 num까지 num 자기자신의 약수를 찾는데 있으면 false를 반환
		}
		return true;
	}
	
	public ArrayList<Integer> solution(int n,int[] arr) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int tmp=arr[i];
			int res=0;
			while(tmp>0) {
				int t = tmp%10;
				res= res*10+t;
				tmp=tmp/10;
			}
			if(isPrime(res)) answer.add(res);
		}
		/* 내가 푼 풀이
		int max = 0;
		
		for(int l=0;l<arr.length-1;l++) {
			if(arr[l]>max) max=arr[l];
		}
		
		int[] cnt = new int[max+1];
		cnt[0]=1;
		cnt[1]=1;
		for(int j=2;j<=max;j++) {
			if(cnt[j]==0) {
				for(int k=j;k<=max;k=k+j) cnt[k]=1;
				cnt[j]=0;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			String s = String.valueOf(arr[i]);
			s = new StringBuilder(s).reverse().toString();
			arr[i] = Integer.parseInt(s);

			
			if(cnt[arr[i]]==0) answer.add(arr[i]);
			
		}
		*/
		return answer;
		
	}
	public static void main(String[] args) {
		_06 T = new _06();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= kb.nextInt();
		}
		for(int x:T.solution(n,arr)) {
			System.out.print(x+" ");
		}
				
	}
	
}
