package _01;

import java.util.*;

public class _11 {

	public String solution(String str) {
	
		String answer = "";
		str = str + " ";
		int cnt = 1;
		char[] s = str.toCharArray();
		for(int i=0;i<str.length()-1;i++) {

			if(s[i]==s[i+1]) {
				cnt++;
			} else{
				answer+=s[i];
				if(cnt>1) answer+=String.valueOf(cnt);
				cnt=1;
			} 
		}
		
		return answer;
		
	}
	public static void main(String[] args) {
		_11 T = new _11();
		
		Scanner kb = new Scanner(System.in);

		String str = kb.next();
		System.out.print(T.solution(str));
	
	} 

}
