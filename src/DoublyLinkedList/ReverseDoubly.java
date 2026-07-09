package DoublyLinkedList;

public class ReverseDoubly {
    public DNode reverse(DNode head) {

        //empty node or null node
        if(head == null || head.next == null) return head;

        DNode temp = null;
        DNode curr = head ;
        DNode fwd = null;
        while (curr != null) {
            //Save next node
            fwd = curr.next;

            //Swap next and prev
            curr.next = curr.prev;
            curr.prev = fwd;

            //move ahead
            temp = curr;
            curr = fwd;
        }
        //new head
        head = temp;
        return head;
    }
    public static void main(String[] args) {
        DLL list = new DLL();

        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);

        System.out.println("Original List:");
        list.display();

        ReverseDoubly obj = new ReverseDoubly(); //create an obj of reverseDoubly class

        // Save the current head because after reversing
        // the old head will become the new tail
        DNode oldHead = list.head;

        // Reverse the doubly linked list
        // reverse() returns the new head
        list.head = obj.reverse(list.head);

        // Update the tail
        list.tail = oldHead;

        System.out.println("Reversed List:");
        list.display();
    }
}
