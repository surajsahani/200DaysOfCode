
import java.io.*;
public class MergeInBetween<ListNode> {
	

	    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
	        ListNode left = list1;
	        ListNode right = list1;
	        
	        while(a-- > 1) {
	            left = left.next;
	        }
	        while(b-- >= 0) {
	            right = right.next;
	        }
	        
	        ListNode last = list2;
	        while(last.next != null) {
	            last = last.next;
	        }
	        
	        left.next = list2;
	        last.next = right;
	        
	        return list1;
	    }

}
