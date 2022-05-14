package algorithm.leetcode;

import java.util.PriorityQueue;

public class MergeKLists {

	
	public ListNode mergeKLists(ListNode[] lists) {
		
		ListNode root = new ListNode();
		ListNode result = root, node;
		
		PriorityQueue<ListNode> pq = new PriorityQueue<>(
				(ListNode n1, ListNode n2) -> n1.val <= n2.val ? -1 : 1);
		
		for(int i=0; i<lists.length; i++) {
			if(lists[i] != null) {
				pq.offer(lists[i]);
			}
		}
		
		while(!pq.isEmpty()) {
			node = pq.poll();
			result.next = node;
			result = result.next;
			
			if(result.next != null) {
				pq.add(result.next);
			}
			
		}
		
		return root.next;
	}
}
