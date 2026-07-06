package LinkedList;

public class MergeTwoSortedLL {
    public static ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        ListNode t1 = head1;
        ListNode t2 = head2;

        while(t1 != null && t2 != null) {
            if(t1.val <= t2.val) {
                temp.next = t1;
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                t2 = t2.next;
            }
            temp = temp.next;
        }
        if(t1 != null) {  //If any nodes are left in the first list, attach them directly
            temp.next = t1;
        }
        if(t2 != null) { //If any nodes are left in the second list, attach them directly
            temp.next = t2;
        }
        return dummy.next;
    }
    public static void display(ListNode head) {
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(9);

        a.next = b;
        b.next = c;
        c.next = d;

        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        ListNode h = new ListNode(8);

        e.next = f;
        f.next = g;
        g.next = h;

        System.out.println("Original List:");
        display(a);
        display(e);

        ListNode ans =  merge(a,e);
        System.out.println("After Merging List:");
        display(ans);
    }


}
