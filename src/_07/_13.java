package _07;

import java.util.*;

//class Node{
//int data;
//Node lt,rt;
//public Node(int val) {
//	data=val;
//	lt=rt=null;
//}
//}

public class _13 {
	static int n,m,answer=0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	public void DFS(int v) {
		/**
		 * 	경로탐색 (인접리스트)
		 */
		if(v==n) answer++;
		else {
			for(int nv : graph.get(v)) {
				if(ch[nv]==0) {
					ch[nv]=1;
					DFS(nv);
					ch[nv]=0;	//위에서 한 호출 취소
				}
			}
		}
		
	}
	public static void main(String[] args) {
		_13 T = new _13();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();	//node의 갯수
		m=kb.nextInt();	//간선의 갯수
		graph=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=n;i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch=new int[n+1];
		for(int i=0;i<m;i++) {
			int a= kb.nextInt();
			int b= kb.nextInt();
			graph.get(a).add(b);
		}
		ch[1]=1;
		T.DFS(1);
		System.out.println(answer);
			
	}
}
