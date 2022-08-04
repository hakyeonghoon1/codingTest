package _05;

import java.util.*;

public class _06 {

	public int solution(int n, int k) {
		
		int answer=0;
		/**
		 * 
		 * 	queue.offer(x)	:	x 값을 넣어준다.
		 * 	queue.poll(x)	:	x 값을 꺼내준다.
		 * 	queue.peek()	:	제일 앞에있는 값을 확인만한다.
		 * 	queue.size()	:	크기화인
		 * 	queue.contains(x):	포함여	
		 */
		
		Queue<Integer> Q = new LinkedList<>();
		for(int i=1;i<=n;i++) Q.offer(i);
		while(!Q.isEmpty()) {
			for(int i=1;i<k;i++) Q.offer(Q.poll());
			Q.poll();
			
			if(Q.size()==1) answer=Q.poll();
		
		}

		return answer;
		
	}
	public static void main(String[] args) {
		_06 T = new _06();
		
		Scanner kb = new Scanner(System.in);

		int n= kb.nextInt();
		int k= kb.nextInt();

		System.out.print(T.solution(k,n));
	
	} 
	
}
