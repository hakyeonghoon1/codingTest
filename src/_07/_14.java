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

public class _14 {
	static int n,m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	public void BFS(int v) {
		
		/**
		 * 	그래프 최단거리 (BFS)
		 */
		Queue<Integer> queue = new LinkedList<>();
		ch[v]=1;
		dis[v]=0;
		queue.offer(v);
		while(!queue.isEmpty()) {
			int cv=queue.poll();
			for(int nv : graph.get(cv)) {
				if(ch[nv]==0) {
					ch[nv]=1;
					queue.offer(nv);
					dis[nv] = dis[cv]+1;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		_14 T = new _14();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();	//node의 갯수
		m=kb.nextInt();	//간선의 갯수
		graph=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=n;i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch=new int[n+1];
		dis=new int[n+1];
		for(int i=0;i<m;i++) {
			int a= kb.nextInt();
			int b= kb.nextInt();
			graph.get(a).add(b);
		}
		ch[1]=1;
		T.BFS(1);
		for(int i=2;i<=n;i++) {
			System.out.println(i+" : "+dis[i]);
		}
			
	}
}
