package algorithm.leetcode;

public class AddTwoNumbers {

	
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	
		int sum = 0;
		int carry = 0;
		int reminder = 0;
		
		ListNode result = new ListNode(0);
		ListNode node = result; 
		
		while(l1 != null || l2 != null || carry != 0) {
			
			if(l1 != null) {
				sum = l1.val;
				l1 = l1.next;
			}
			if(l2 != null) {
				sum += l2.val;
				l2 = l2.next;
				
			}
			
			reminder = (sum + carry) % 10;
			carry = (sum + carry) / 10;
			node = node.next;
			node = new ListNode(reminder);
			sum = 0;
		}
		
		return result.next;
	}
}
