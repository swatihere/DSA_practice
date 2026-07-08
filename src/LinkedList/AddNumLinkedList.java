package LinkedList;

public class AddNumLinkedList {
    // Reverse a Linked List
    public static ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Add Two Numbers
    public static ListNode addTwoNumbers(ListNode head1, ListNode head2) {

        // Reverse both linked lists using reverse fun
        head1 = reverse(head1);
        head2 = reverse(head2);

        // Create a dummy node for the answer
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        int carry = 0;

        // Continue until both lists and carry are finished
        while (head1 != null || head2 != null || carry != 0) {

            int sum = carry;

            // Add value from first list
            if (head1 != null) {
                sum += head1.val;
                head1 = head1.next;
            }

            // Add value from second list
            if (head2 != null) {
                sum += head2.val;
                head2 = head2.next;
            }

            // Create a new node with the last digit
            ListNode newNode = new ListNode(sum % 10);

            temp.next = newNode;
            temp = temp.next;

            // Update carry
            carry = sum / 10;
        }

        // Reverse the answer because it is currently in reverse order
        return reverse(dummy.next);
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

        // First Number = 342
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(2);

        a.next = b;
        b.next = c;

        // Second Number = 465
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode(5);

        d.next = e;
        e.next = f;

        System.out.println("First Number:");
        display(a);

        System.out.println("Second Number:");
        display(d);

        ListNode ans = addTwoNumbers(a, d);

        System.out.println("Sum:");
        display(ans);
    }
}

