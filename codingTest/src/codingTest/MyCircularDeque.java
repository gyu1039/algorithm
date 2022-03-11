package codingTest;

public class MyCircularDeque {
	
	int[] deque;
	int len;
	int front = -1, rear; 
	
	public MyCircularDeque(int k) {
		deque = new int[k];
		rear = k;
		
    }
    
    public boolean insertFront(int value) { 
    	
    	if(len == deque.length) return false;
    	
    	front = (front + 1) % deque.length;
    	deque[front] = value;
    	len++;
    	
    	return true;
    }
    
    public boolean insertLast(int value) {
    	
    	if(len == deque.length) return false;
    	if(rear == 0) rear = deque.length;
    	
    	rear--;
    	if(rear < 0) rear = 0;
    	deque[rear] = value;
    	++len;
    	
    	return true;
    }
    
    public boolean deleteFront() {
    	
    	if(len == 0) return false;
    	
    	front = (front - 1) % deque.length;
    	len--;
    	return true;
    	
    }
    
    public boolean deleteLast() {
    	if(len == 0) return false;
    	
    	
    	rear = (rear + 1) & deque.length;
    	len--;
    	
    	return true;
    }
    
    public int getFront() {
    	if(len == 0) return -1;
    	
    	return deque[front];
    	
    }
    
    public int getRear() {
    	if(len == 0) return -1;
    	
    	
    	return deque[rear];
    }
    
    public boolean isEmpty() {
    	
    	return (len == 0) ? true : false;
    }
    
    public boolean isFull() {
    	
    	return (len == deque.length) ? true : false;
    }

}
