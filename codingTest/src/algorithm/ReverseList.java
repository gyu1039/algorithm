package algorithm;

public class ReverseList {
	
	ListNode next;
	
	public ListNode reverse(ListNode node, ListNode reverse) {
		
		if(node == null) return reverse;
		
		next = node.next;
		node.next = reverse;
		reverse = node;
		
		return reverse(next, reverse);
	}
	
	public ListNode reverseListRecursive(ListNode head) {
		
		return reverse(head, null);
	}
	
	public ListNode reverseListLoop(ListNode head) {

		ListNode next = null, rev=null;
		
		while(head != null) {
			
			next = head.next; 	
			head.next = rev;
			rev = head;
			head = next;
			
		}

		return rev;
	}
	
}
