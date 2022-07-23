package _01;

import java.util.*;

public class _10 {

	public int[] solution(String str, char t) {
	
		int[] answer = new int[str.length()];
		int p =1000;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==t) {
				p=0;
				answer[i]=p;
			} else {
				p++;
				answer[i]=p;
			}
		}
		p=1000;
		for(int j=str.length()-1;j>=0;j--) {
			if(str.charAt(j)==t) p=0;
			else {
				p++;
				answer[j]=Math.min(answer[j], p);
			}
		}
		return answer;
		
	}
	public static void main(String[] args) {
		_10 T = new _10();
		
		Scanner kb = new Scanner(System.in);

		String str = kb.next();
		char c = kb.next().charAt(0);
		for(int x : T.solution(str,c)) {
			System.out.print(x+" ");
		}
		
	
	} 

}
