package _01;

import java.util.*;

public class _07 {

	public String solution(String str) {
		
		/* 풀이 1
		String answer = "YES";
		str = str.toUpperCase();
		int len = str.length();
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
		}
		*/
		
		//풀이 2
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer="YES";
		
		/* 내가 푼 풀이 (정답)
		String answer = "";
		String str2 = str.toUpperCase();
		char[] s = str2.toCharArray();
		int lt=0, rt= str2.length()-1;
		
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
		_07 T = new _07();
		
		Scanner kb = new Scanner(System.in);

		String str = kb.next();
			
		System.out.println(T.solution(str));
		
	}

}
