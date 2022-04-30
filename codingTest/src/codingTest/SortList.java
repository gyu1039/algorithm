package codingTest;

import java.util.ArrayList;
import java.util.List;

public class SortList {

	public ListNode sortList(ListNode head) {

		List<Integer> l = new ArrayList<>();
		ListNode node = head;
		
		while(node != null) {
			l.add(node.val);
			node= node.next;
		}
		
		l.sort((Integer n1, Integer n2) -> n1 > n2 ? 1 : 
					n1 == n2 ? 0 : -1);
        
		int len = l.size();
        node = head;
		for(int i=0; i<len; i++) {
			node.val = l.get(i);
            node = node.next; 
		}
		
		return head;
	}
	
	public ListNode sortList2(ListNode head) {
		
		if(head == null || head.next == null) {
			return head;
		}
		
		ListNode half = null;
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null) {
			half = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		half.next = null;
		
		ListNode l1 = sortList2(head);
		ListNode l2 = sortList2(slow);
		
		return mergeTwoLists(l1, l2);
	}
	
	public ListNode mergeTwoLists(ListNode n1, ListNode n2) {
		
		if(n1 != null && n2 != null) {
			if(n1.val > n2.val) {
				ListNode tmp = n1;
				n1 = n2;
				n2 = tmp;
			}
			n1.next = mergeTwoLists(n1.next, n2);
		}
		 
		return n1 != null ? n1 : n2;
	}
	
}
