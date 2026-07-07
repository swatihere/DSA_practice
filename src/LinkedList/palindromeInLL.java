package LinkedList;

public class palindromeInLL {
    public static boolean isPalindrome(ListNode head) {
        //for empty list or one node
        if(head == null || head.next == null){
            return true;
        }
        //Find the middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse the second half
        ListNode prev = null;
        ListNode curr = slow;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //Compare both halves
        ListNode t1 = head;
        ListNode t2 = prev;
       while(t1 != null && t2 != null){
           if(t1.val != t2.val){
               return false;
           }
           t1 = t1.next;
           t2 = t2.next;
       }
       return true;
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

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(1);

        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println("Linked List:");
        display(a);

        if (isPalindrome(a)) {
            System.out.println("is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}
