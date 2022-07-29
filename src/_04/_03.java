package _04;

import java.util.*;

public class _03 {

	public ArrayList<Integer> solution(int n, int k, int[] arr) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> result = new HashMap<>();
		
		for(int i=0;i<k-1;i++) {
			result.put(arr[i], result.getOrDefault(arr[i], 0)+1);
			
		}
		int lt=0;
		for(int rt=k-1;rt<n;rt++) {
			
			result.put(arr[rt], result.getOrDefault(arr[rt], 0)+1);
			answer.add(result.size());
			
			result.put(arr[lt],result.get(arr[lt])-1);
			if(result.get(arr[lt])==0){
				result.remove(arr[lt]);
			}
			lt++;
			
	
		}
		
			
		return answer;
		
	}
	public static void main(String[] args) {
		_03 T = new _03();
		
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		for(int x :T.solution(n, k, arr)) {
			System.out.print(x+ " ");
		}
	
	} 
	
}
