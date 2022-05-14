package algorithm.leetcode;

public class SwapPairs {

	
	public ListNode swapPairsForLoop(ListNode head) {
		
		ListNode root = new ListNode(), prev, tmp;
		prev = root;
		prev.next = head;
		
		while(head != null && head.next != null) {
			
			tmp = head.next;
			head.next = tmp.next;
			tmp.next = head;
			
			prev.next = tmp;
			
			head = head.next;
			prev = prev.next.next;
		}
		
		return root.next;
	}
	
	public ListNode swapPairsRecursive(ListNode head) {
		
		ListNode p;
		
		while(head != null && head.next != null) {
			p = head.next;
			head.next = swapPairsRecursive(p.next);
			p.next = head;
			
			return p;
		}
		
		return head;
	}
}
