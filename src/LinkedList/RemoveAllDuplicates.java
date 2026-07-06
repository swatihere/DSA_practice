package LinkedList;

public class RemoveAllDuplicates {
    public static ListNode removeAllDuplicates(ListNode head) {

        //Make dummy node before head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {

            //check if current value is repeated
            if(curr.next != null && curr.val == curr.next.val) {

                //skip all nodes with the same value
                while(curr.next != null && curr.val == curr.next.val) {
                    curr =  curr.next;
                }

                //Remove all duplicate
                prev.next = curr.next;
            }
            else {
                prev = prev.next; //move prev only if current is unique
            }
            curr = curr.next;
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

    public static void main(String[] args){
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

        a = removeAllDuplicates(a);

        System.out.println("After Removing All Duplicates:");
        display(a);
    }
}
