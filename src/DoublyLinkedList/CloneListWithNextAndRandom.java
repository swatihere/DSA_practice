package DoublyLinkedList;

public class CloneListWithNextAndRandom {
    public DNode copyRandomList(DNode head) {
        //Empty List
        if(head == null){
            return null;
        }
        //create copy node
        DNode curr = head;

        while(curr != null){
            //create copy node
            DNode copy = new DNode(curr.val);

            //Insert copy after original node
            copy.next = curr.next;
            curr.next = copy;

            //move to next original node
            curr = copy.next;
        }
        //assign random pointers
        curr = head;
        while(curr != null){
            //if random exist
            if(curr.random!=null){
                curr.next.random = curr.random.next;
            }
            //move to next original
            curr = curr.next.next;
        }
        //separate both lists
        curr = head;

        //dummy node for copied list
        DNode dummy = new DNode(-1);
        DNode temp = dummy;
        while(curr != null){
            //copy node
            DNode copy = curr.next;
            //restore original list
            curr.next = copy.next;

            //add copy node to copied list
            temp.next = copy;
            copy.prev = temp;
            temp = copy;

            //move to next original node
            curr = curr.next;
        }
        //remove dummy's prev pointer
        if(dummy.next != null){
            dummy.next.prev = null;
        }
        return dummy.next;
    }
    public static void display(DNode head) {

        DNode temp = head;

        while (temp != null) {

            if (temp.random != null) {
                System.out.println(temp.val + " -> " + temp.random.val);
            } else {
                System.out.println(temp.val + " -> null");
            }

            temp = temp.next;
        }
    }
    public static void main(String[] args) {

        // Create nodes
        DNode a = new DNode(10);
        DNode b = new DNode(20);
        DNode c = new DNode(30);
        DNode d = new DNode(40);

        // Connect next pointers
        a.next = b;
        b.next = c;
        c.next = d;

        // Connect prev pointers
        b.prev = a;
        c.prev = b;
        d.prev = c;

        // Connect random pointers
        a.random = c;
        b.random = a;
        c.random = d;
        d.random = b;

        System.out.println("Original List:");
        display(a);

        System.out.println("\nOriginal Random:");
        display(a);

        CloneListWithNextAndRandom obj = new CloneListWithNextAndRandom();

        DNode clone = obj.copyRandomList(a);

        System.out.println("\nCopied List:");
        display(clone);

        System.out.println("\nCopied Random:");
        display(clone);
    }
}
