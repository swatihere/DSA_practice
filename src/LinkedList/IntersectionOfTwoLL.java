package LinkedList;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
    public ListNode IntersectionNode (ListNode head1, ListNode head2){
        int len1 = 0;   //Find the length of list 1
        ListNode temp1 = head1;
        while (temp1 != null){
            temp1 = temp1.next;
            len1++;
        }
        int len2 = 0;  //find the length of list 2
        ListNode temp2 = head2;
        while (temp2 != null){
            temp2 = temp2.next;
            len2++;
        }
        //reset pointer
        temp1 = head1;
        temp2 = head2;

        //move to the pointer of the longer list

        if(len1>len2){
            for(int i = 0 ; i < len1 - len2 ; i ++){
                temp1 = temp1.next;
            }
        }
        else {
            for(int i = 0 ; i < len2 - len1 ; i ++) {
                temp2 = temp2.next;
            }
        }
        //move both pointer together
        while(temp1 !=null && temp2 != null){
            if (temp1 == temp2){
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
    public ListNode swapNode(ListNode head, int k){
        ListNode first = head;
        ListNode slow = head;
        ListNode fast = head;

        for(int i = 0; i < k; i ++){  //move 1st to kth node from the beginning
            first = first.next;
        }
        fast = first; //start fast from the kth node

        //find kth node from the end
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        int temp = first.val;
        first.val = slow.val;
        slow.val = temp;

        return head;
    }
    public static void display(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

}

public class IntersectionOfTwoLL {
    public static void main(String[] args) {
                // Common part
                ListNode c1 = new ListNode(30);
                ListNode c2 = new ListNode(40);
                ListNode c3 = new ListNode(50);

                c1.next = c2;
                c2.next = c3;

                // First Linked List
                ListNode a1 = new ListNode(10);
                ListNode a2 = new ListNode(20);

                a1.next = a2;
                a2.next = c1;

                // Second Linked List
                ListNode b1 = new ListNode(15);

                b1.next = c1;

                //Object to call the Method

              ListNode obj = new ListNode(0);  //create an obj to call the IntersectionNode() method

              ListNode ans = obj.IntersectionNode(a1,b1);  //Call the method to find the intersection node

              if(ans != null){  //Check if an intersection exists
                  System.out.println("Intersection Node = " +ans.val);
              }
              else{
                  System.out.println("No Intersection Node");
              }

              obj.swapNode(a1,2);
              System.out.println("After Swapping");
              ListNode.display(a1);
    }
}
