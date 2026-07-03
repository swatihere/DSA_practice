package LinkedList;
//class Node{
//    int val ;
//    Node next; //Default value is Null
//
//    Node(int val){
//        this.val = val ;
//    }
//}

public class NodeOfLinkedList {
    public static void main(String[] args) {
        Node a = new Node(10); //head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40); //tail node

        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println(a.val);  //value of a
        System.out.println(b.val);  //value of b
        System.out.println(b.next); //address of c
        System.out.println(c.next.val); //value of d

    }

}
