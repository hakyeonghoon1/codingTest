package _03;

import java.util.*;

public class _05 {

	public int solution(int n) {
		
		int answer = 0;
		int sum = 0, lt=0;
		
		int[] number = new int[n/2+1];	//15까지도 필요 없고, n/2 의 몫+1까지의 숫자만 있어도 된다.
		for(int i=0;i<n/2+1;i++) {
			number[i]=i+1;

		}
		for(int rt=0; rt<n/2+1;rt++) {
			sum +=number[rt];
			if(sum==n) answer++;
			while(sum>=n) {
				sum-=number[lt++];
				if(sum==n) answer++;
			}
		}
		
		return answer;
		
	}
	public static void main(String[] args) {
		_05 T = new _05();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		
		System.out.print(T.solution(n));
		
	} 
	
}
