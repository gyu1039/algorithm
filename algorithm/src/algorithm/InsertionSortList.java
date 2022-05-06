package algorithm;

public class InsertionSortList {

	public ListNode insertionSortList(ListNode head) {
		
		ListNode cur, parent;
		parent = new ListNode(0);
		cur = parent;
		
		
		while(head != null) {
			
			while(cur.next != null && cur.next.val < head.val) {
				cur = cur.next;
			}
			
			ListNode tmp1 = cur.next;
			ListNode tmp2 = head.next;
			
			cur.next = head;
			head.next = tmp1;
			head = tmp2;
			
			if(head != null && cur.val > head.val) {
				cur = parent;
			}
		}
		
		return parent.next;
	}
	
}
