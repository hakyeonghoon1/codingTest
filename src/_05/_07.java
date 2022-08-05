package _05;

import java.util.*;

public class _07 {

	public String solution(String s, String k) {
		
		String answer="YES";
		/**
		 * 
		 * 	queue.offer(x)	:	x 값을 넣어준다.
		 * 	queue.poll()	:	값을 꺼내준다.
		 * 	queue.peek()	:	제일 앞에있는 값을 확인만한다.
		 * 	queue.size()	:	크기화인
		 * 	queue.contains(x):	포함여부	
		 */
		
		Queue<Character> Q = new LinkedList<>();
		
		for(char x : s.toCharArray()) {
			Q.offer(x);
		}
		
		for(char x : k.toCharArray()) {
			if(Q.contains(x)) {
				if(x==Q.peek()) Q.poll();
				else return "NO";
			}
		}
		if(Q.size()!=0) return "NO";
		return answer;
		
	}
	public static void main(String[] args) {
		_07 T = new _07();
		
		Scanner kb = new Scanner(System.in);

		String s= kb.next();
		String k= kb.next();

		System.out.print(T.solution(s,k));
	
	} 
	
}
