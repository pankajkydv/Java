package Tree;

public class BST {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BST(int[] arr) {
		this.root = construct(arr, 0, arr.length - 1);
	}

	private Node construct(int[] arr, int lo, int hi) {
//		Base Case
		if (lo > hi) {
			return null;
		}
//	 calculate mid
		int mid = (lo + hi) / 2;
//		create node
		Node nn = new Node();
		nn.data = arr[mid];
		nn.left = construct(arr, lo, mid - 1);
		nn.right = construct(arr, mid + 1, hi);
		return nn;

	}
	
	public boolean find(int item) {
		 return this.find(this.root, item);
	}
	private boolean find(Node node,int item) {
		if(node==null) {
			return false;
		}
		if(item<node.data) {
			return find(node.left,item);
		}
		else if(item>node.data){
			return find(node.right,item);
		}
		else {
			return true;
		}
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node == null) {
			return;
		}
		String str = "";
		if (node.left != null) {
			str += node.left.data;
		} else {
			str += ".";
		}
		str += "->" + node.data + "<-";
		if (node.right != null) {
			str += node.right.data;
		} else {
			str += ".";

		}
		System.out.println(str);
//		call left node
		display(node.left);
//		call right node
		display(node.right);
	}

}
