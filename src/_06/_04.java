package _06;

import java.util.*;

public class _04 {

	public int[] solution(int s, int n, int[] arr) {
		
		int[] cache = new int[s];
		for(int x: arr) {
			int pos=-1;
			for(int i=0;i<s;i++) if(x==cache[i]) pos=i;
			
			if(pos==-1) {
				for(int i=s-1;i>=1;i--) {
					cache[i]=cache[i-1];
				}
				
			}
			else {
				for(int i=pos;i>=1;i--) {
					cache[i]=cache[i-1];
				}
			}
			cache[0]=x;
		}
		
		return cache;
		
	}
	public static void main(String[] args) {
		_04 T = new _04();
		
		Scanner kb = new Scanner(System.in);

		int s = kb.nextInt();
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) arr[i]=kb.nextInt();
		for(int x: T.solution(s,n,arr)) {
			System.out.print(x+" ");
		}
	} 
	
}
