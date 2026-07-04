package LinkedList;

class node {
    int val;
    node next;

    node(int val) {
        this.val = val;
    }
}

class linkedlist {

    public static void deletenode(node target) {
        target.val = target.next.val;
        target.next = target.next.next;
    }

    public static void display(node head) {
        node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static node middlemode(node head) {    //DELETE FROM THE MIDDLE OF LINKED LIST
        node slow = head; //slow shouls be at the head
        node fast = head; //intially fast also be at head

        while (fast != null && fast.next != null) {
            slow = slow.next; //slow should be slower than the fast
            fast = fast.next.next; //fast should be after the slow
        }
        return slow;
    }
}

public class DeleteInSinglyLinkedList {

    public static void main(String[] args) {

        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        node f = new node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println("Original List:");
        linkedlist.display(a);

        linkedlist.deletenode(c);

        System.out.println("After Deletion:");
        linkedlist.display(a);
    }
}