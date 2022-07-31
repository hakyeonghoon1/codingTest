package _05;

import java.util.*;

public class _02 {

	public String solution(String s) {
		
		String answer="";
		
		Stack<Character> stack = new Stack<>();
		
		for(char x : s.toCharArray()) {
			if(x=='(') stack.push(x);
			else if(x==')'){
				stack.pop();
			} else {
				if(stack.isEmpty()) answer+=x;
			}
			
		}
			
		return answer;
		
	}
	public static void main(String[] args) {
		_02 T = new _02();
		
		Scanner kb = new Scanner(System.in);

		String n = kb.next();
		
		System.out.print(T.solution(n));
	
	} 
	
}
