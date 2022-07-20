package _01;

import java.util.*;
import java.util.Scanner;

public class _05 {

	public String solution(String str) {
		
		String answer;
		
		//정답 풀이
		char[] s= str.toCharArray();
		int lt=0, rt=str.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(s[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(s[rt])) {
				rt--;
			}else {
				char tmp = s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
		}
		answer=String.valueOf(s);
		
		/* 내가 푼 풀이(결과값은 나오지만 정답으로 인정되지 않음)
		int lt = 0, rt=str.length()-1;
		
		while(lt<rt) {
			char[] x = str.toCharArray();
			if((97<=x[lt] && x[lt]<=122) || (65<=x[lt] && x[lt]<=90)) {
				char tmp = x[lt];
				x[lt]=x[rt];
				x[rt]=tmp;
			}
			lt++;
			rt--;
			str = String.valueOf(x);
			answer =str;
		}
		*/
		return answer;
	}
	
	public static void main(String[] args) {
		_05 T = new _05();
		
		Scanner kb = new Scanner(System.in);

		String str = kb.next();
		System.out.println(T.solution(str));
	
	}

}
