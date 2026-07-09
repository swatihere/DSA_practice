package DoublyLinkedList;
public class FlattenaMultilevelDoublyLL {
                    //Save the original next node.
                    //Attach the child list after the current node.
                    //Find the tail of the child list.
                    //Connect the saved next node after the child list.
                    //Set child = null

public DNode flatten(DNode head) {
    if (head == null) {
        return head;
    }
    DNode curr = head;
    while (curr != null) {
        if (curr.child != null) {
            curr = curr.next;
        }
        else {
            //save next node
            DNode fwd = curr.next;

            //Flatten child first
            DNode c = flatten(curr.child);

            //remove child pointer
            curr.child = null;

            //conncet curr with child node
            curr.next = c ;
            c.prev = curr;

            //reach the tail of child first
            DNode temp = c;
            while (temp.next != null) {
                temp = temp.next;
            }

            //connect tail with saved next node
            temp.next = fwd;
            if(fwd!= null){
                fwd.prev = temp;
            }

            //continue traversal
            curr = fwd;
        }
    }
    return head;
}
}
