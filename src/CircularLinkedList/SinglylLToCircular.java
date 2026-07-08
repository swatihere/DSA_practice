package CircularLinkedList;

public class SinglylLToCircular {
    public static CNode convertToCircular(CNode head) {

        if (head == null) {
            return null;
        }

        CNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = head;
        return head;
    }

    public static void display(CNode head) {   //display for circular list

        if (head == null) {
            return;
        }

        CNode temp = head;

        // Print the first node
        System.out.print(temp.val + " ");
        temp = temp.next;

        // Print the remaining nodes
        while (temp != head) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }
    public static void main(String[] args) {

        CNode a = new CNode(10);
        CNode b = new CNode(20);
        CNode c = new CNode(30);
        CNode d = new CNode(40);

        a.next = b;
        b.next = c;
        c.next = d;

        a = convertToCircular(a);

        System.out.println("Circular Linked List:");
        display(a);
    }
}




