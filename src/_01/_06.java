package _01;

import java.util.*;

public class _06 {

	public String solution(String str) {
		
		String answer="";
		
		for(int i=0; i<str.length();i++) {
			//System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i))==i) {
				answer+=str.charAt(i);
			}
		}
		
		/* 내가 푼 풀
		char[] s =  str.toCharArray();
		
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<i;j++) {
				if(i>0 && s[j]==s[i]) {
					s[i]=0;
				}
			}
		}
		answer = String.valueOf(s);
		*/
		return answer;
	}
	
	public static void main(String[] args) {
		_06 T = new _06();
		
		Scanner kb = new Scanner(System.in);

		String str = kb.next();
		System.out.println(T.solution(str));
	
	}

}
