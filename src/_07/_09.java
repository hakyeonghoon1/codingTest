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

public class _09 {
	Node root;
	public int DFS(int L, Node root) {
		/**
		 * 	tree 말단노드까지의 가장 짧은 경로 (DFS)
		 * 	재귀를 해보기 위해서 DFS로 한 것, 실제 풀이는 BFS로 푸는 것이 맞다.
		 */
		if(root.lt==null && root.rt==null) return L;
		else return Math.min(DFS(L+1,root.lt), DFS(L+1, root.rt));
		
	}
	public static void main(String[] args) {
		_09 tree = new _09();
		tree.root=new Node(1);
		tree.root.lt=new Node(2);
		tree.root.rt=new Node(3);
		tree.root.lt.lt=new Node(4);
		tree.root.lt.rt=new Node(5);
		System.out.println(tree.DFS(0, tree.root));
			
	}
}
