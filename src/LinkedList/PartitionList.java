package LinkedList;

public class PartitionList {

    public static ListNode partition(ListNode head, int x) {
        //Dummy node for the first list (<x)
        ListNode dummy1 = new ListNode(0);

        //Dummy node for the second list (>=x)
        ListNode dummy2 = new ListNode(0);

        // t1 builds the first list
        ListNode t1 = dummy1;

        // t2 builds the second list
        ListNode t2 = dummy2;


        // t is used to traverse the original list
        ListNode t = head;

        while(t != null){
            if(t.val < x){

                // Add node to the first list
                t1.next = t;
                t1 = t1.next;
            }
            else{
                // Add node to the second list
                t2.next = t;
                t2 = t2.next;
            }
                t = t.next;
        }
        //End the second list
        t2.next = null;

        // Connect both lists
        t1.next = dummy2.next;

        // Return the head of the new list
        return dummy1.next;
    }

    // Display the linked list
    public static void display(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }
    public static void main(String[] args) {

        // Create nodes
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(2);

        // Connect nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println("Original List:");
        display(a);

        // Partition around x = 3
        a = partition(a, 3);

        System.out.println("Partitioned List:");
        display(a);
    }

}
