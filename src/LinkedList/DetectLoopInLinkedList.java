package LinkedList;

public class DetectLoopInLinkedList {

    public static void detectLoop(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Detect the loop
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                System.out.println("Loop Exists");

                // Find the starting node of the loop
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                System.out.println("Starting Node = " + slow.val);

                // Find the ending node of the loop
                while (fast.next != slow) {
                    fast = fast.next;
                }

                System.out.println("Ending Node = " + fast.val);

                return;
            }
        }

        System.out.println("No Loop");
    }

    public static void main(String[] args) {

        // Create nodes
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);

        // Connect nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Create loop
        e.next = c;

        // Call the method
        detectLoop(a);
    }
}