package _01;

import java.util.Scanner;

public class _02 {

	public String solution(String str) {
		
		String answer ="";

		for(char x : str.toCharArray()) {
			if(x>97 && x<=122) answer += (char)(x-32);
			else answer += (char)(x+32);
		}
		/*
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
		}
		*/
		return answer;
	}
	
	public static void main(String[] args) {
		_02 T = new _02();
		
		Scanner kb = new Scanner(System.in);

		String str = kb.next();

		System.out.print(T.solution(str));;
	}

}
