package StackUsingArray;

public class StackUsingArrayClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingArray stack = new StackUsingArray();

//		stack.push(50);
//		stack.push(40);
//		stack.push(30);
//		stack.push(20);
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();

		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);

			stack.display();
		}
		System.out.println(stack.size());
		System.out.println(stack.top());
		for (int i = 1; i <= 5; i++) {
			stack.pop();

			stack.display();
		}

	}

}
