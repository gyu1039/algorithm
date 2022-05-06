package algorithm;

public class MyCircularDeque {

	int[] deque;
	int len = 0;
	int front, rear;
	
	
	public MyCircularDeque(int k) {
		deque = new int[k];
    }
    
    public boolean insertFront(int value) { 
    	
    	if(len == deque.length) return false;
        
        if(isEmpty()) {
            front = -1;
            rear = 0;
        }
        
    	front = (front + 1) % deque.length;
    	deque[front] = value;
    	len = len + 1;
    	
    	return true;
    }
    
    public boolean insertLast(int value) {
    	
    	if(len == deque.length) return false;
        
        if(isEmpty()) {
            front = 0;
            rear = 1;
        }
        
    	rear = (rear - 1 + deque.length) % deque.length;
    	deque[rear] = value;
    	len = len + 1;

    	return true;
    }
    
    public boolean deleteFront() {
    	
    	if(len == 0) {
    		return false;
    	}
    	
    	front = (front + deque.length - 1) % deque.length;
    	len = len - 1;

    	return true;
    }
    
    public boolean deleteLast() {
    	
    	if(len == 0) {
    		return false;
    	}
    	
    	rear = (rear + 1) % deque.length;
    	len = len - 1;
    	
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
    	
    	return len == 0;
    }
    
    public boolean isFull() {
    	
    	return len == deque.length;
    }
    
    public static void main(String[] args) {
    	MyCircularDeque d = new MyCircularDeque(77);
    	d.insertFront(89);
    	d.deleteLast();
    	d.insertFront(19);
    	d.insertFront(23);
    	d.insertFront(23);
    	d.insertFront(82);
    	
    	d.insertFront(45);			// 4 - 45 3 - 82 2 - 23 1: 23 0:19 76:
    	System.out.println(d.front);
    	System.out.println(d.rear);
    	d.deleteLast();
    	System.out.println("rear ���� �� " +d.rear);
    	d.insertLast(74);
    	System.out.println("rear �߰� �� " + d.rear);
    	d.deleteFront();
    	d.insertLast(98);
    	System.out.println("rear �߰� �� " + d.rear);
    	d.insertLast(99);
    	System.out.println("rear �߰��� " + d.rear);
    	d.insertFront(8);
    	d.deleteFront();
    	d.insertFront(75);
    	d.deleteLast();
    	System.out.println("***************");
    	System.out.println("rear ���� �� " +d.rear);
    	d.insertLast(35);
    	System.out.println("rear �߰� �� " + d.rear);
    	d.insertLast(59);
    	System.out.println("rear �߰� �� " + d.rear);
    	System.out.println("***************");
    	d.insertFront(22);
    	System.out.println("front: " + d.front);
    	System.out.println("rear: " + d.rear);
    	System.out.println("�迭 ���� : " + d.deque.length);
    	System.out.println("���� ���� : " + d.len);
    	System.out.println();
    	d.deleteLast();
    	System.out.println("ù��°  ���� ��  rear: " + d.rear);
    	System.out.println("���� ���� : " + d.len);
    	System.out.println();
    	d.deleteLast();
    	System.out.println("�� ��° rear: " + d.rear);
    	System.out.println("���� ���� : " + d.len);
    	System.out.println();
    	d.deleteLast();
    	System.out.println("�� ��° rear: " + d.rear);
    	System.out.println("���� ���� : " + d.len);
    	System.out.println();
    	d.deleteLast();
    	System.out.println("�� ��° rear: " + d.rear);
    	System.out.println("���� ���� : " + d.len);
    	System.out.println();
    	d.deleteLast();
    	System.out.println("�ټ� ��° rear: " + d.rear);
    	System.out.println("���� ���� : " + d.len);
    	System.out.println();
    	d.deleteLast();
    	System.out.println("���� ��° rear: " + d.rear);
    	System.out.println("���� ���� : " + d.len);
    	System.out.println();
    	d.deleteLast();
    	System.out.println("�ϰ� ��° rear: " + d.rear);
    	System.out.println("���� ���� : " + d.len);
    	System.out.println();
    	
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */