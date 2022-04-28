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
	
}
