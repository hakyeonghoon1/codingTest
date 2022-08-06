package _05;

import java.util.*;

class Person{
	int id;
	int priority;
	
	public Person(int id, int priority) {
		this.id=id;
		this.priority=priority;
	}
}

public class _08 {

	public int solution(int n, int m, int[] arr) {
		
		int answer=0;
		/**
		 * 
		 * 	queue.offer(x)	:	x 값을 넣어준다.
		 * 	queue.poll()	:	값을 꺼내준다.
		 * 	queue.peek()	:	제일 앞에있는 값을 확인만한다.
		 * 	queue.size()	:	크기화인
		 * 	queue.contains(x):	포함여부	
		 */
		
		Queue<Person> Q = new LinkedList<>();
		for(int i=0;i<n;i++) {
			Q.offer(new Person(i,arr[i]));
		}
		
		while(!Q.isEmpty()) {
			Person tmp = Q.poll();
			for(Person x : Q) {
				if(x.priority>tmp.priority) {
					Q.offer(tmp);
					tmp=null;
					break;
				}
			}
			if(tmp!=null) {
				answer++;
				if(tmp.id==m) return answer;
			}
		}

		return answer;
		
	}
	public static void main(String[] args) {
		_08 T = new _08();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m= kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}

		System.out.print(T.solution(n,m,arr));
	
	} 
	
}
