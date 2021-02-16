package StackUsingArray;

public class StackUsingArray {
	private int[] data;
	private int top;
	public static final int default_capacity = 10;

	public StackUsingArray() throws Exception {
		this(default_capacity);
	}

	public StackUsingArray(int capacity) throws Exception {
		if (capacity < 1) {
			throw new Exception("capacity is invalid");
		}
		this.data = new int[capacity];
		this.top = -1;
	}

	public int size() {
		return this.top + 1;
	}

	public boolean isempty() {
		return this.size() == 0;
	}

	public void push(int value) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("Stack is full");
		}
		this.top++;
		this.data[this.top] = value;

	}

	public int pop() throws Exception {
		if (this.size() == 0) {
			throw new Exception("stack is Empty");
		}
		int rev = this.data[this.top];
		this.data[this.top] = 0;
		this.top--;
		return rev;

	}

	public int top() throws Exception {
		if (this.size() == 0) {
			throw new Exception("stack is Empty");
		}
		int rev = this.data[this.top];
		this.data[this.top] = 0;
		return rev;

	}

	public void display() {
		for (int i = this.top; i >= 0; i--) {
			System.out.print(this.data[i] + " ");
		}
		System.out.println("End");
	}

}
