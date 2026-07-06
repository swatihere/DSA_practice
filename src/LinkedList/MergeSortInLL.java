package LinkedList;

import static LinkedList.MergeTwoSortedLL.merge;

public class MergeSortInLL {
    private static ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {  //If the list is empty or has only one node
            return head;
        }
        //Find the middle of the Linked List
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //Split the Linked list into halves
        ListNode head2 = slow.next;
        slow.next = null;

        //Recursively sort the first half
        head = mergeSort(head);
        //Recursively sort the second half
        head2 = mergeSort(head2);

        return merge(head,head2);
    }
    public static void display(ListNode head) {
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main (String[] args) {

        ListNode a = new ListNode(4);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(7);
        ListNode d = new ListNode(1);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(3);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println("Original List:");
        display(a);

        a = mergeSort(a);

        System.out.println("Sorted List:");
        display(a);
    }
    }


