package _01;

import java.util.*;

public class _10 {

	public String solution(String str) {
	
		String answer="";
		
		String[] sepStr = str.split(" ");
		String s = sepStr[0];
		String t = sepStr[1];
		char[] r = s.toCharArray();
		//System.out.print(s.indexOf(t));
		String[] s2 = s.split(t);
		
		for(int i=0;i<s2.length;i++) {
			System.out.print(s2[i]+i);
		}
		
		return answer;
		
	}
	public static void main(String[] args) {
		_10 T = new _10();
		
		Scanner kb = new Scanner(System.in);

		String str = kb.nextLine();
		System.out.println(T.solution(str));
	
	}

}
