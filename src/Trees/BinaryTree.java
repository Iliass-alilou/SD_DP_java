package Trees;

public class BinaryTree {
	// creation the root
	
	public static void main(String[] args) {
		Node node = new Node(6);
		node.addRecursive(node, 4);
		node.addRecursive(node, 8);
		node.addRecursive(node, 3);
		node.addRecursive(node, 5);
		node.addRecursive(node, 7);
		node.addRecursive(node, 9);
		node.DFS(node);
		System.out.println(node.toString());
		System.out.println(node.containsNode_Rec(node,9));
		node.deleteRecursive(node, 4);
		System.out.println();
		System.out.println();
		System.out.println(node.toString());
		node.DFS(node);
		node.DFS_Without_Rec(node);
		
	}
	
}
