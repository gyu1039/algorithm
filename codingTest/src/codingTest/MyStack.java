package codingTest;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

	Queue queue;
	
	public MyStack() {
		queue = new LinkedList();	
	}

	public void push(int x) {
		queue.add(x);
		
		for(int i = 0; i<queue.size() - 1; i++) {
			queue.add(queue.poll());
		}
	}

	public int pop() {
		
		return (int)queue.poll();
	}

	public int top() {
		return (int)queue.peek();
	}

	public boolean empty() {
		return queue.size() == 0;
	}
}
