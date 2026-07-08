package CircularLinkedList;
 class CNode{
    int val;
    CNode next;

    public CNode(int val){
        this.val = val;
    }
}

public class CircularTraversal {
    public static void display(CNode head){
        //if the list is null
        if(head == null){
            return;
        }
        CNode temp = head;
        while(temp.next != head){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.print(temp.val+" ");
    }
    public static void main(String[] args) {

        CNode a = new CNode(10);
        CNode b = new CNode(20);
        CNode c = new CNode(30);
        CNode d = new CNode(40);
        CNode e = new CNode(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Make it circular
        e.next = a;

        display(a);
    }
}
