package QueueUsingArray;

public class QueueUsingArrayClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueueUsingArray queue = new QueueUsingArray(5);
		for (int i = 1; i <= 5; i++) {
			queue.Enqueue(i * 10);

			queue.display();
		}
//		queue.Enqueue(60);
		System.out.println("************");
		while (!queue.isempty()) {
			queue.display();
			System.out.println("FRONT =" + queue.Front());
			queue.Dequeue();

		}
	}

}
