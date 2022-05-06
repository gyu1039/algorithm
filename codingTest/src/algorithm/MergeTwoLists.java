package algorithm;

public class MergeTwoLists {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		
		ListNode tmp = null;
		
		if(list1 == null || (list2 != null && list1.val > list2.val)) {
			tmp = list1;
			list1 = list2;
			list2 = tmp;
		}
		
		if(list1 != null) {	
			list1.next = mergeTwoLists(list1.next, list2);
		}
		
		return list1;
	}

}

