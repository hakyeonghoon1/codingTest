package _04;

import java.util.*;

public class _04 {

	public int solution(String s1, String s2) {
		
		int answer=0;

		HashMap<Character,Integer> standard = new HashMap<>();
		HashMap<Character,Integer> compare = new HashMap<>();
		
		for(char x:s2.toCharArray()) standard.put(x,  compare.getOrDefault(x, 0)+1);
		
		int L = s2.length()-1;
		
		for(int i=0;i<L;i++) compare.put(s1.charAt(i), compare.getOrDefault(s1.charAt(i), 0)+1);
		int lt =0;
		for(int rt=L;rt<s1.length();rt++) {
			compare.put(s1.charAt(rt), compare.getOrDefault(s1.charAt(rt),0)+1);
			if(compare.equals(standard)) answer++;
			compare.put(s1.charAt(lt), compare.get(s1.charAt(lt))-1);
			if(compare.get(s1.charAt(lt))==0) compare.remove(s1.charAt(lt));
			lt++;
		}
		return answer;
		
	}
	public static void main(String[] args) {
		_04 T = new _04();
		
		Scanner kb = new Scanner(System.in);

		String s1 = kb.next();
		String s2 = kb.next();
		
		System.out.print(T.solution(s1,s2));
	
	} 
	
}
