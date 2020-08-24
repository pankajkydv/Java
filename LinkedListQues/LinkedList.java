package LinkedListQues;

public class LinkedList {
	private class Node {
		int data;
		Node next;

	}

	private Node head;
	private Node tail;
	int size;

	public void display() {
		System.out.println("-------------");
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		System.out.println("-----------------");
	}

	public void AddLast(int item) {
//	create new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

//	attach new node
		if (this.size >= 1) {
			this.tail.next = nn;
		}
//	update summary object(head,tail,size)
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
		}
	}

	public void AddFirst(int item) {
//	create new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
//	attach new node
		if (this.size >= 1) {
			nn.next = head;
		}
//	update my summary  objects
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}
	}

	public int GetFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked list is empty");
		}
		return this.head.data;
	}

	public int GetLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("linked list is empty");
		}
		return this.tail.data;

	}

	public int GetAt(int indx) throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked list is empty");
		}
		if (indx < 0 || indx >= this.size) {
			throw new Exception("index is invalid");
		}
		Node temp = this.head;
		for (int i = 1; i <= indx; i++) {
			temp = temp.next;
		}
		return temp.data;

	}

	private Node GetNodeAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked list is empty");
		}
		if (index < 0 || index >= this.size) {
			throw new Exception("index is invalid");
		}
		Node temp = this.head;
		for (int i = 1; i <= index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void AddAt(int item, int indx) throws Exception {
		if (indx < 0 || indx > this.size) {
			throw new Exception("index is invalid");
		}
		if (indx == 0) {
			AddFirst(item);
		}

		else if (indx == this.size) {
			AddLast(item);
		} else {
//	create new node
			Node nn = new Node();
			nn.data = item;
			nn.next = null;
//	attach my new node at index
			Node nm1 = GetNodeAt(indx - 1);
			Node np1 = GetNodeAt(indx); /* or use np1=nm1.next */
			nm1.next = nn;
			nn.next = np1;
//	update summary
			this.size++;
		}
	}

	public int RemoveFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked list is empty");
		}
		int rv = this.head.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}
		return rv;
	}

	public int RemoveLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked list is empty");
		}
		int rv = this.tail.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node sizem2 = GetNodeAt(this.size - 2);
			this.tail = sizem2;
			this.tail.next = null;
			this.size--;
		}
		return rv;
	}

	public int RemoveAt(int indx) throws Exception {
		if (indx < 0 || indx >= this.size)
			throw new Exception("index is invalid");
		if (indx == 0) {
			return this.RemoveFirst();
		} else if (indx == this.size) {
			return this.RemoveLast();
		} else {
			Node nm1 = GetNodeAt(indx - 1);
			Node n = nm1.next; /* or use int rv = GetAt(indx) and return rv */
			Node np1 = GetNodeAt(indx + 1);
			nm1.next = np1;
			this.size--;
			return n.data;
		}
	}

	public void ReverseData() throws Exception {
		int left = 0;
		int right = size - 1;
		while (left < right) {
			Node ln = GetNodeAt(left);
			Node rt = GetNodeAt(right);

			int temp = ln.data;
			ln.data = rt.data;
			rt.data = temp;
			left++;
			right--;
		}
	}

	public void ReversePointer() {
		Node prev = this.head;
		Node curr = prev.next;
		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;

			prev = curr;
			curr = ahead;
		}
//		Swap
		Node t = this.head;
		this.head = this.tail;
		this.tail = t;

		this.tail.next = null;
	}

	public int Mid() {
		Node slow = this.head;
		Node fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;

	}
}
