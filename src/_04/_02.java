package _04;

import java.util.*;

public class _02 {

	public String solution(String n, String s) {
		
		String answer="YES";

		HashMap<Character,Integer> compare = new HashMap<>();
		
		
		for(char x : n.toCharArray()) {
			compare.put(x, compare.getOrDefault(x, 0)+1);
		}
		
		for(char y : s.toCharArray()) {
			
			if(!compare.containsKey(y) || compare.get(y)==0) {
				return "NO";
			}
			compare.put(y, compare.get(y)-1);
				
		}
			
		return answer;
		
	}
	public static void main(String[] args) {
		_02 T = new _02();
		
		Scanner kb = new Scanner(System.in);

		String n = kb.next();
		String m = kb.next();
		
		System.out.print(T.solution(n,m));
	
	} 
	
}
