package _05;

import java.util.*;

public class _04 {

	public int solution(String str) {
		
		int answer=0;
		Stack<Integer> stack = new Stack<>();
		
		for(char x: str.toCharArray()) {
			if(Character.isDigit(x)) {
				stack.push(x-48);
			}
			else {
				int lt = stack.pop();
				int rt = stack.pop();
				if(x=='+') stack.push(lt+rt);
				else if(x=='-') stack.push(lt-rt);
				else if(x=='*') stack.push(lt*rt);
				else if(x=='/') stack.push(lt/rt);
			}
		}
		answer=stack.get(0);
		return answer;
		
	}
	public static void main(String[] args) {
		_04 T = new _04();
		
		Scanner kb = new Scanner(System.in);

		String str= kb.next();
		
		
		System.out.print(T.solution(str));
	
	} 
	
}
