package Stacks;

import java.util.Stack;
class ListNode {
    int val;
    ListNode next;
    // Constructor
    ListNode(int x) {
        this.val = x;
        this.next = null;
    }
}

public class RemoveNodeFromLL {
    public ListNode removeNodes(ListNode head) {

        // Create a stack to store the nodes
        Stack<ListNode> st = new Stack<>();

        // Start from the head of the linked list
        ListNode temp = head;

        // Traverse the linked list
        while (temp != null) {

            // Remove all smaller nodes from the stack
            // because the current node is greater
            while (st.size() > 0 && st.peek().val < temp.val) {
                st.pop();
            }

            // Push the current node into the stack
            st.push(temp);

            // Move to the next node
            temp = temp.next;
        }

        // Rebuild the linked list from the stack
        ListNode newHead = null;

        while (st.size() > 0) {

            // Remove the top node from the stack
            ListNode top = st.pop();

            // Connect it with the new linked list
            top.next = temp;

            // Move the head to the current node
            temp = top;
        }

        // Return the head of the new linked list
        return temp;
    }

    // Function to print the linked list
    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating the linked list
        // 5 -> 2 -> 13 -> 3 -> 8

        ListNode head = new ListNode(5);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(13);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(8);

        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println("Original Linked List:");
        printList(head);

        RemoveNodeFromLL obj = new RemoveNodeFromLL();

        // Remove the required nodes
        head = obj.removeNodes(head);

        System.out.println("After Removing Nodes:");
        printList(head);
    }
}
