package LinkedList;

public class ReverseLinkedList {
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){

            //Save the next node
            ListNode next = curr.next;

            //Reverse the link
            curr.next = prev;

            //Move prev and curr one step forward
            prev = curr;
            curr = next;
        }
        //prev becomes the new head
        return prev;
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

        a = reverse(a);

        System.out.println("Reversed List:");
        display(a);
    }
}
