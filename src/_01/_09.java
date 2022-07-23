package _01;

import java.util.*;

public class _09 {

	public int solution(String str) {
	
		/* 풀이 1:아스키코드를 사용한 풀이
		 
		int answer=0;
		for(char x: str.toCharArray()) {
			
			if(x>=48 && x<=57) answer=answer*10+(x-48);
		}
		
		*/
		
		/* Character.isDigit와 parseInt 를 사용한 풀이
		
		String answer="";
		for(char x:str.toCharArray()) {
			if(Character.isDigit(x)) answer+=x;
		}
		return Integer.parseInt(answer);
		
		*/
		
		//내가 푼 풀이: 알파벳이 아닌 것 만 담아서 parseInt로 변환
		String answer="";
	
		char[] s = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			if(!Character.isAlphabetic(s[i])) {
				answer+=s[i];
			}
		}
		return Integer.parseInt(answer);
		
	}
	
	public static void main(String[] args) {
		_09 T = new _09();
		
		Scanner kb = new Scanner(System.in);

		String str = kb.next();
		System.out.println(T.solution(str));
	
	}

}
