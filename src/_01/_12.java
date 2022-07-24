package _01;

import java.util.*;

public class _12 {

	public String solution(int n, String str) {
	
		String answer = "";
		
		//정답풀이
		for(int i=0;i<n;i++) {
			String tmp = str.substring(0,7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp,2);
			answer +=(char)num;
			str=str.substring(7);
		}
		
		/* 내가 푼 풀이
		String[] newStr = new String[n];
		for(int i=0;i<n;i++) {
			newStr[i]=str.substring((i*7),(i*7)+7);
			
			newStr[i] = newStr[i].replaceAll("[#]", "1");
			newStr[i] = newStr[i].replaceAll("[*]", "0");
				
			int binaryToDemical = Integer.parseInt(newStr[i],2);
			
			answer += String.valueOf((char)binaryToDemical);
			
		}
		*/
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
