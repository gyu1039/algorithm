package algorithm.leetcode;

public class MyCircularQueue {
	
	int[] queue;
	int front, rear = -1;
	int len;

	public MyCircularQueue(int k) {
		queue = new int[k];
    }
    
    public boolean enQueue(int value) {
    	if(!isFull()) {
    		rear = (rear + 1) % queue.length;
    		queue[rear] = value;
    		len++;
    		return true;
    	} else return false;
    	
    }
    
    public boolean deQueue() {
    	if(!isEmpty()) {
    		front = (front + 1) % queue.length;
    		len--;
    		return true;
    	} else return false;
    }
    
    public int Front() {
        if(!isEmpty()) {
        	return queue[front];
        } else return -1;
    	
    }
    
    public int Rear() {
    	if(!isEmpty()) {
    		return queue[rear];
    	} else return -1;
        
    }
    
    public boolean isEmpty() {
        return len == 0;
    }
    
    public boolean isFull() {
        return len == queue.length;	
    }
}
