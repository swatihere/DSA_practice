package LinkedList;

public class SwapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        // If the list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        //Dummy node before the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        //Pointer before the current pair
        ListNode prev = dummy;

        while(prev.next != null && prev.next.next != null) {

            //First and Second nodes of a pair
            ListNode first = prev.next;
            ListNode second = first.next;

            //Swap the pair
            first.next = second.next;
            second.next = first;
            prev.next = second;

            //Move to the next part
            prev = first;
        }
        return dummy.next;
    }
    public static void display(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }
    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("Original List:");
        display(a);

        a = swapPairs(a);

        System.out.println("After Swapping Pairs:");
        display(a);
    }
}
