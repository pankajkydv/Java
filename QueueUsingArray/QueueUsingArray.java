package QueueUsingArray;

public class QueueUsingArray {
	int[] data;
	int front;
	int size;
	int ai;
	public static final int default_capacity = 5;

	public QueueUsingArray() throws Exception {
		this(default_capacity);

	}

	public QueueUsingArray(int capacity) throws Exception {
		if (capacity < 1) {
			throw new Exception("capacity is invalid");
		}
		this.data = new int[capacity];
		this.front = 0;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isempty() {
		return this.size() == 0;
	}

	public void Enqueue(int value) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("queue is full");
		}
		ai = (this.front + this.size) % data.length;
		this.data[this.ai] = value;
		this.size++;

	}

	public int Dequeue() {
		int rv = this.data[this.front];
		this.data[this.front] = 0;
		this.front = (this.front + 1) % data.length;
		this.size--;
		return rv;
	}

	public int Front() {
		int rv = this.data[this.front];
		return rv;
	}

	public void display() {
		for (int i = 0; i < this.size; i++) {
			int ai = (this.front + i) % this.data.length;
			System.out.print(this.data[ai] + "<= ");
		}
		System.out.println(" END");

	}

}
