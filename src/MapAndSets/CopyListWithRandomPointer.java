package MapAndSets;

import java.util.HashMap;

public class CopyListWithRandomPointer {
    static class Node {
        int data;
        Node next;
        Node random;

        Node(int data){
            this.data = data;
            this.next = null;
            this.random = null;
        }
    }
    public static Node copyList(Node head){
        if (head == null){
            return null;
        }
        //Hashmap Store Original store ---> Copy node
        HashMap<Node, Node> map = new HashMap<>();

        Node current = head;

        while (current != null){          // Create copy of every node
            map.put(current, new Node(current.data));    // Create a new node with same data
            current = current.next;   // Move to next node
        }
        current = head;

        //connect next and random pointers
        while (current != null){
           Node copy = map.get(current);  //get the copied node
           copy.next = map.get(current.next);  //connect next pointer
           copy.random = map.get(current.random); //connect random pointer
           current = current.next; //move to next original node
        }
        return map.get(head);
    }
    public static void printList(Node head){
       Node current = head; //start from head
        while (current != null){   //traverse the list
            System.out.print(current.data + " ");
            current = current.next;  //move to next node
        }
        System.out.println();
    }
    public static void main(String[] args) {

        // Create original list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        // Set random pointers
        head.random = head.next.next;          // 1 -> 3
        head.next.random = head;               // 2 -> 1
        head.next.next.random = head.next;     // 3 -> 2

        // Copy the list
        Node copy = copyList(head);

        // Print copied list
        printList(copy);
    }
}
