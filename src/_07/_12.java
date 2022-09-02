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

public class _12 {
	static int n,m,answer=0;
	static int[][] graph;
	static int[] ch;
	public void DFS(int v) {
		/**
		 * 	경로탐색 (DFS)
		 */
		if(v==n) answer++;
		else {
			for(int i=1;i<=n;i++) {
				if(graph[v][i]==1 && ch[i]==0) {
					ch[i]=1;
					DFS(i);
					ch[i]=0;	//위에서 한 호출 취소
				}
			}
		}
		
	}
	public static void main(String[] args) {
		_12 T = new _12();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();	//node의 갯수
		m=kb.nextInt();	//간선의 갯수
		graph=new int[n+1][n+1];
		ch=new int[n+1];
		for(int i=0;i<m;i++) {
			int a= kb.nextInt();
			int b= kb.nextInt();
			graph[a][b]=1;
		}
		ch[1]=1;
		T.DFS(1);
		System.out.println(answer);
			
	}
}
