package LinkedList;

public class RemoveDuplicate {
    public static ListNode removeduplicate(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        while(temp != null && temp.next != null) {
            if(temp.val == temp.next.val) {
                temp.next = temp.next.next; //remove duplicate
            }
            else {
                temp = temp.next;
            }
        }
        return head;
    }
    public static void display(ListNode head) {
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(5);
        ListNode h = new ListNode(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        System.out.println("Original List:");
        display(a);

        a = removeduplicate(a);

        System.out.println("After Removing Duplicates:");
        display(a);
    }
}
