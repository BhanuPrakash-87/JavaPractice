package check;

class ListNode {
	int val;
	ListNode next;
	
	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class MiddleOfLinkedList {

	public ListNode findMiddleNode(ListNode head) {
		
        if (head == null) {
            return null; // Handle empty list
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
	
	public static void main(String[] args) {
		
		MiddleOfLinkedList listFinder = new MiddleOfLinkedList();
		
		// Example 1: Odd number of nodes
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        ListNode middle1 = listFinder.findMiddleNode(head1);
        System.out.println("Middle node of list 1 (odd length): " + middle1.val); // Expected: 3
	}
}
