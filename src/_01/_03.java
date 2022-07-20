package _01;

import java.util.Scanner;

public class _03 {

	public String solution(String str) {
		
		String answer ="";
		
		
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			if(len>m) {
				m =len;
				answer=x;
			}
		}
		
		/*
		int m = Integer.MIN_VALUE, pos;
		while((pos=str.indexOf(' '))!=-1) {		//pos는 띄어쓰기의 번
			String tmp = str.substring(0,pos);
			int len = tmp.length();
			if(len>m) {
				m=len;
				answer=tmp;
			}
			str = str.substring(pos+1);	// 다음 단어로 str 변경
		}
		if(str.length()>m) answer =str;	//to가 끝나고 나면 다음 공백을 찾을수가 없어서 while문에서 돌지 않으므로 마지막 단어 따로 체크
		*/
		return answer;
	}
	
	public static void main(String[] args) {
		_03 T = new _03();
		
		Scanner kb = new Scanner(System.in);

		String str = kb.nextLine();

		System.out.print(T.solution(str));;
	}

}
