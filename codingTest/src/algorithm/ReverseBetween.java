package algorithm;

public class ReverseBetween {

	public static void main(String[] args) {
		// 

	}
	
	public ListNode reverseBetween(ListNode head, int left, int right) {
	
		if(head == null || left == right) return head;
		
		ListNode start, root, end, tmp;
		root = start = new ListNode();
		start.next = head;
		
		for(int i=0; i<left-1; i++) {
			start = start.next;
		}
		end = start.next;
		
		for(int i=0; i<right-left; i++) {			
			tmp = start.next;
			start.next = end.next;
			end.next = end.next.next;
			start.next.next = tmp;
		}
		
		
		return root.next;
	}
	

}
