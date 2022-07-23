package _01;

import java.util.*;

public class _08 {

	public String solution(String str) {
		String answer="NO";
		
		str=str.toUpperCase().replaceAll("[^A-Z]","");	// ^ => 부정 , 알파벳 대문자가 아니면 비워버려라
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) {
			answer="YES";
		}
		/* 내가 푼 풀이
		String answer="";
		str=str.toUpperCase();
		
		String newStr ="";
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				newStr+=str.charAt(i);	
			}
			
		}
		System.out.println(newStr);
		char[] s= newStr.toCharArray();
		int lt=0,rt=newStr.length()-1;
		
		while(lt<rt) {
			
			if(s[lt]==s[rt]) {
				answer="YES";
			}else {
				answer="NO";
				break;
			}			
			
			lt++;
			rt--;
		}
		*/
		return answer;
	}
	
	public static void main(String[] args) {
		_08 T = new _08();
		
		Scanner kb = new Scanner(System.in);

		String str = kb.nextLine();
		System.out.println(T.solution(str));
	
	}

}
