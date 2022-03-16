package codingTest;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {

	
	int size = 1000000;
    ListNode[] table;
	
	public MyHashMap() {
		table = new ListNode[size];
    }
    
    public void put(int key, int value) {
    	
    	int index = key % size;
    	
    	if(table[index] == null) {
    		table[index] = new ListNode(key, value);
    		return;
    	}
    	
    	ListNode node = table[index];
    	
    	while(node != null) {
    		
    		if(node.key == key) {
    			node.val = value;
    			return;
    		}
    		
    		if(node.next == null) {
    			node.next = new ListNode(key, value);
    			return;
    		}
    		
    		node = node.next;
    	}
    	
    }
    
    public int get(int key) {
    	
    	int index = key % size;
    	
    	if(table[index] == null) return -1;
    	
    	ListNode node = table[index];
    	
    	while(node !=null) {
    		
    		if(node.key == key) {
    			return node.val;
    		}
    		
    		if(node.next != null) {
    			node = node.next;
    		} else break;
    	}
    	
    	return -1;
    }
    
    public void remove(int key) {
        
    	int index = key % size;
    	
    	if(table[index] == null) return;
    	
    	ListNode node = table[index];
    	
    	if(node.key == key) {
    		table[index] = node.next;
    		return;
    	}
    	
    	ListNode prev = node;
    	
    	while(node != null) {
    		
    		if(node.next != null) {	
    			prev = node;
        		node = node.next;
    		}
    		
    		if(node.key == key) {
    			prev.next = node.next;
    			return;
    		}
    		    				
    	}
    	
    	return;
    }
}
