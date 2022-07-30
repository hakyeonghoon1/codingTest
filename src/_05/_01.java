package _05;

import java.util.*;

public class _01 {

	public String solution(String s) {
		
		String answer="YES";
		
		Stack<Character> stack = new Stack<>();
		
		for(char x : s.toCharArray()) {
			if(x=='(') stack.push(x);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		
		if(!stack.isEmpty()) return "NO";	//스텍에 뭔가 남아있으면 거짓
		
		return answer;
		
	}
	public static void main(String[] args) {
		_01 T = new _01();
		
		Scanner kb = new Scanner(System.in);

		String n = kb.next();
		
		System.out.print(T.solution(n));
	
	} 
	
}
