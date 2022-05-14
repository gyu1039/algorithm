package algorithm.leetcode;

public class OddEvenList {

	
	public ListNode oddEvenList(ListNode head) {
		
		if(head == null) return null;
		
		ListNode odd, even, evenList;
		odd = head;
		even = odd.next;
		evenList = even;
		
		while(even != null && even.next != null) {
			
			odd.next = odd.next.next;
			even.next = even.next.next;
			
			odd = odd.next;
			even = even.next;
		}
		
		odd.next = evenList;
		
		return head;
	}
}
