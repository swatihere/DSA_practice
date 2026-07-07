package LinkedList;

import static LinkedList.MergeTwoSortedLL.merge;

public class MergeKthSortedList {
    public static ListNode mergeKList(ListNode head1 , ListNode head2) {
        //Merge Two Lists
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        ListNode t1 = head1;
        ListNode t2 = head2;

        while(t1 != null && t2 != null){
            if(t1.val <= t2.val){
                temp.next = t1;
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                t2 = t2.next;
            }
            temp = temp.next;
        }
        if(t1 != null){
            temp.next = t1;
        }
        if(t2 != null){
            temp.next = t2;
        }
        return dummy.next;
    }
    //Merge Kth list
    public static ListNode mergeKList(ListNode[] lists){
        if(lists.length == 0){
            return null;
        }
        ListNode ans = lists[0];
        for(int i = 1; i < lists.length; i++){
            ans = merge(ans,lists[i]);
        }
        return ans;
    }
    public static void display(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }
    public static void main(String[] args) {

        // First List
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(4);
        ListNode a3 = new ListNode(5);

        a1.next = a2;
        a2.next = a3;

        // Second List
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(4);

        b1.next = b2;
        b2.next = b3;

        // Third List
        ListNode c1 = new ListNode(2);
        ListNode c2 = new ListNode(6);

        c1.next = c2;

        // Store all heads in an array
        ListNode[] lists = {a1, b1, c1};

        ListNode ans = mergeKList(lists);

        System.out.println("Merged List:");
        display(ans);
    }
}
