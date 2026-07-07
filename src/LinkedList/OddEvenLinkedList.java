package LinkedList;

public class OddEvenLinkedList {
    public static ListNode oddEvenList(ListNode head) {

        //If list is empty or has only one node
        if(head==null || head.next==null){
            return head;
        }

        //odd points to the first node
        ListNode odd = head;

        //even point to the second node
        ListNode even = head.next;

        // Save the head of the even list
        ListNode evenHead = even;

        while(even != null && even.next != null){

            //connect odd node
            odd.next = even.next;
            odd = odd.next;

            //connect even node
            even.next = odd.next;
            even = even.next;
        }
        // Attach even list after odd list
        odd.next = evenHead;

        return head;
    }
    public static void display(ListNode head) {
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
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

        a = oddEvenList(a);

        System.out.println("Odd Even List:");
        display(a);
    }
}
