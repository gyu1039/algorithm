package algorithm.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class IsPanlindrome {

	boolean isPanlindrome1(ListNode head) {
		if(head == null) return true;
		Deque<ListNode> d = new ArrayDeque<>();
		ListNode node = head;
		
		while(node != null) {
			d.add(node);
			node = node.next;			
		}
		
		while(d.size() > 1) {
			
			if(d.pollFirst().val != d.pollLast().val) return false;
		}
		
		
		return true;
	}
	
	static boolean isPalindrome2(ListNode head) {
	
		ListNode tmp = null;
		ListNode rev = null;
		ListNode fast = head;
		ListNode slow = head;
		
		
	
		
		
		while(fast != null && fast.next != null) {	
			
			fast = fast.next.next;
			
			tmp = rev;
			rev = new ListNode(slow.val, slow.next);		
			rev.next = tmp;
			slow = slow.next;
		}
		
		if(fast != null) slow = slow.next;

		
		while(rev != null && rev.val == slow.val) {

			rev = rev.next;
			slow = slow.next;
		}
		
		
		return rev == null;
	}
	
	
	public static void main(String[] arsg) {
		
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(2);
		ListNode n4 = new ListNode(1);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		System.out.println(isPalindrome2(n1));
		
	}
	
}



