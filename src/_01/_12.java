package _01;

import java.util.*;

public class _12 {

	public String solution(int n, String str) {
	
		String answer = "";
		String[] newStr = new String[n];
		for(int i=0;i<n;i++) {
			newStr[i]=str.substring((i*7),(i*7)+7);
			System.out.println(newStr[i]);
			
		}
		
		return answer;
		
	}
	public static void main(String[] args) {
		_12 T = new _12();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		String str = kb.next();
		System.out.print(T.solution(n,str));
	
	} 

}
