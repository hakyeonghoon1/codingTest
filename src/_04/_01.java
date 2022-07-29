package _04;

import java.util.*;

public class _01 {

	public char solution(int n, String s) {
		
		char answer=' ';
		
		HashMap<Character, Integer> result = new HashMap<>();
		
		for(char x : s.toCharArray()){
			result.put(x, result.getOrDefault(x,0)+1);
		}
		/* 해쉬맵 기타 필요한 메서
		
		System.out.println(result.containsKey('A')); 	A를 포함하고 있는지?
		System.out.println(result.size());				result의 갯수 
		System.out.println(result.remove('C');			해당 키 삭제(C)
		
		*/
		int max=Integer.MIN_VALUE;
		for(char x:result.keySet()) {

			if(result.get(x)>max) {
				max=result.get(x);
				answer=x;
			}
		}
		
		
		return answer;
		
	}
	public static void main(String[] args) {
		_01 T = new _01();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		String m = kb.next();
		
		System.out.print(T.solution(n,m));
	
	} 
	
}
