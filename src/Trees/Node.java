package Trees;
import java.util.*;

public class Node {

	private int value;
	private Node left;
	private Node right;
	
	public Node(int value ) {
		this.value = value;
		left = null;
		right = null;
	}
	
	// define la racine;
	
	
	
	
	public boolean isEmpty(Node node) {
		return node == null;
	}
	
	/*       Inserting element 
	 * 1. find the place to keep the tree sorted
	 * 2. if the element of currrent Node < value of inserted Node ==> right
	 * 3. if the element of currrent Node > value of inserted Node ==> left
	 * 4. demmarre la focntion public add a partir du racine
	 * */
	
	public Node addRecursive (Node current , int value ) {
		if(current == null) {
			return new Node(value);
		}
		if( value < current.value) {
			current.left = addRecursive(current.left,value);
		}else if (current.value < value) {
			current.right = addRecursive(current.right,value);
		}else {
			return current;
		}
		return current;
	}
	
	// public addc fucntion calling addRecursive
	
//	public void add(int value) {
//		node = addRecursive(node, value);
//	}
	
	
	// 2. find an element
	/*
	 * 1. creat methode to parcour Arbre
	 * */
	
	public boolean containsNode_Rec (Node current , int value) {
		if(current == null) {
			return false;
		}if(current.value == value) {
			return true;
		}
		return value < current.value ?
				containsNode_Rec(current.left , value)
				:containsNode_Rec(current.right , value);
	}
	
	
	// 3. delet element 
	/*
	 * 1. 1st find the element recusivelly 
	 * 2. if node don't have any children ==> replace node by null
	 * 3. if a node have one child ==> replace the node by it's one child
	 * 4. if the node have 2 child ==>we should find the small element of teh sub tree of the current Node
	 * */
	
	//to find the small element always we look to the left 
	public int findTheSmallElement (Node current) {
		if(current.left == null) {
			return current.value;
		}
		return findTheSmallElement(current.left);
	}
	
	public Node deleteRecursive(Node current , int value ) {
		
		if(current == null) {
			return null;
		}
		if(value == current.value) {
			if(current.left == null && current.right == null) {
				return null;
			}if(current.right == null) {
				return current.left;
			}if(current.left == null) {
				return current.right;
			}
			/*if the current Node have two childs*/
			if(current.left != null && current.right != null) {
				int smallestValue = findTheSmallElement(current);
				current.value = smallestValue;
				current.right = deleteRecursive(current.right,smallestValue);
				return current;
			}
			
		}
		if(value < current.value) {
			current.left = deleteRecursive(current.left, value);
			return current;
		}
		current.right = deleteRecursive(current.right, value);
		return current;
	}
	
	
	// Depth-First Search   (DFS)
	/*
	 * vist first the left sub tree  then the Root after that vist the right sub tree
	 * 
	 * */
	
	public void DFS (Node node) {
		if(node != null) {
			DFS(node.left);
			System.out.print(" "+ node.value);
			DFS(node.right);
		}
	}
	
	// DFS without FRecursion ==> use stack
	
	public void DFS_Without_Rec(Node node) {
		if(node == null) {
			return;
		}
		Stack<Node> stack = new Stack<>();
		while (node!=null || stack.isEmpty()) {
			while(node !=null) {
				stack.push(node);
				node = node.left;
			}
			Node top = stack.pop();
			System.out.print(" " + top.value);   
			node = top.right;
		}
	}
	
	// BFS 
	/*
	 * vist a level before going to the nex level
	 * 
	 * use a Que for implemention to hold the nodes frome eache level
	 * */
	public void BFS (Node node) {
		if(node == null) {
			return ;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			Node nodeRemoved = queue.remove();
			System.out.println(" "+nodeRemoved.value );
			if(nodeRemoved.left != null) {
				queue.add(nodeRemoved.left);
			}
			if(nodeRemoved.right != null) {
				queue.add(nodeRemoved.right);
			}
		}
	}
	
	

	@Override
	public String toString() {
		return "Node [value=" + value + ", left=" + left + ", right=" + right + "]";
	}
	
	
}
