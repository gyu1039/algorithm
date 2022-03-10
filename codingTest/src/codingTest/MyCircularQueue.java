package codingTest;

public class MyCircularQueue {
	
	int[] array;
	int front, rear = -1;
	int len;

	public MyCircularQueue(int k) {
		array = new int[k];
    }
    
    public boolean enQueue(int value) {
    	if(!isFull()) {
    		rear = (rear + 1) % array.length;
    		array[rear] = value;
    		len++;
    		return true;
    	} else return false;
    	
    }
    
    public boolean deQueue() {
    	if(!isEmpty()) {
    		front = (front + 1) % array.length;
    		len--;
    		return true;
    	} else return false;
    }
    
    public int Front() {
        if(!isEmpty()) {
        	return array[front];
        } else return -1;
    	
    }
    
    public int Rear() {
    	if(!isEmpty()) {
    		return array[rear];
    	} else return -1;
        
    }
    
    public boolean isEmpty() {
        return len == 0;
    }
    
    public boolean isFull() {
        return len == array.length;	
    }
}
