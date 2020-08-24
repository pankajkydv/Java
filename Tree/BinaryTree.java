package Tree;

import java.util.LinkedList;
import java.util.Scanner;

import Tree.BST.Node;

public class BinaryTree {
	public class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}

	}

	private Node root;
	private int size;

	BinaryTree() {
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, false);
	}

	private Node takeInput(Scanner s, Node parent, Boolean isLeftOrRight) {
		if (parent == null) {
			System.out.println("Enter data for root node");
		} else {
			if (isLeftOrRight) {
				System.out.println("Enter data for left child of" + parent.data);
			} else {
				System.out.println("Enter data for right child of" + parent.data);
			}

		}
//		create node
		int nodeData = s.nextInt();
		Node node = new Node(nodeData, null, null);
		this.size++;
		boolean choice = false;
		System.out.println("Do you have left child of " + node.data);
		choice = s.nextBoolean();
		if (choice) {
			node.left = takeInput(s, node, true);
		}
		choice = false;
		System.out.println("Do you right child of " + node.data);
		choice = s.nextBoolean();
		if (choice) {
			node.right = takeInput(s, node, false);
		}
		return node;
	}
//	Display Nodes of tree
	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		String str = "";
		if (node.left != null) {
			str = str + node.left.data + "=>";
		} else {
			str = str + "END=>";
		}
		str = str + node.data;
		if (node.right != null) {
			str = str + "<=" + node.right.data;
		} else {
			str = str + "<=END";
		}
		System.out.println(str);
		if (node.left != null) {
			this.display(node.left);
		}
		if (node.right != null) {
			this.display(node.right);
		}
	}
//	2nd method to display
	
//	private void display(Node node) {
//		if(node==null) {
//			return;
//		}
//		String str="";
//		if(node.left!=null) {
//			str+=node.left.data;
//		}
//		else {
//			str+=".";
//		}
//		str+="->"+node.data+"<-";
//		if(node.right!=null) {
//			str+=node.right.data;
//		}
//		else {
//			str+=".";
//			
//		}
//		System.out.println(str);
////		call left node
//		display(node.left);
////		call right node
//		display(node.right);
//	}

//	Calculating Height of tree
	public int height() {
		return this.height(this.root);
	}
	private int height(Node node) {
		if(node==null) {
			return -1;
		}
		int lheight=this.height(node.left);
		int rheight=this.height(node.right);
		int height=Math.max(lheight, rheight)+1;
		return height;
	}
//	preOrder of tree
	public void preOrder() {
		this.preOrder(this.root);
		System.out.println("END");
	}
	private void preOrder(Node node) {
		if(node==null) {
			return;
		}
		System.out.print(node.data+",");
		preOrder(node.left);
		preOrder(node.right);
	}
//	postOrder of tree
	public void postOrder() {
		this.postOrder(this.root);
		System.out.println("END");
	}
	private void postOrder(Node node) {
		if(node==null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data+",");
	}
//	inOrder of tree
	public void inOrder() {
		this.inOrder(this.root);
		System.out.println("END");
	}
	private void inOrder(Node node) {
		if(node==null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data+",");
		inOrder(node.right);
		
	}
//	levelOrder of tree
	public void levelOrder() {
		LinkedList<Node>queue=new LinkedList<>();
		queue.add(this.root);
		while(!queue.isEmpty()) {
        Node rv=queue.removeFirst();
        System.out.print(rv.data+",");
        if(rv.left!=null) {
      queue.addLast(rv.left);
        }
        if(rv.right!=null) {
        	queue.addLast(rv.right);
        }
		}
		System.out.println("END");
	}
}
