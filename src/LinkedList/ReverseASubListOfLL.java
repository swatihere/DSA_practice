package LinkedList;

public class ReverseASubListOfLL {
    public static ListNode reverseBetween(ListNode head, int left, int right) {

        // If list is empty or only one node
        if (head == null || left == right) {
            return head;
        }

        // Create a dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // temp will reach the node before 'left'
        ListNode temp = dummy;

        for (int i = 1; i < left; i++) {
            temp = temp.next;
        }

        // Divide the list into 3 parts

        ListNode tail1 = temp;
        ListNode head2 = temp.next;

        ListNode tail2 = head2;

        for (int i = left; i < right; i++) {
            tail2 = tail2.next;
        }

        ListNode head3 = tail2.next;

        // Break the list
        tail1.next = null;
        tail2.next = null;

        // Reverse the second part
        ListNode prev = null;
        ListNode curr = head2;

        while (curr != null) {

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Connect the three parts

        tail1.next = prev;     // Connect first part with reversed part

        head2.next = head3;    // head2 is now the tail after reversing

        return dummy.next;
    }
    // Display Linked List
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
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        ListNode h = new ListNode(8);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        System.out.println("Original List:");
        display(a);

        a = reverseBetween(a, 2, 4);

        System.out.println("After Reversing:");
        display(a);
    }
}
