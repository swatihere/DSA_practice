package CircularLinkedList;

class CircularLinkedList{
    CNode head;
    CNode tail;
    int size;

    void deleteAtHead(){
        if(head == null){
            return;
        }
        //only one node
        if(head==tail){
            head=null;
            tail=null;
        }
        else{
            head = head.next;
            tail.next = head;
        }
        size--;
    }
    void deleteAtTail(){
        if(tail==null){
            return;
        }
        if(tail==head){
            head=null;
            tail=null;
        }
        else{
            CNode temp = head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            tail = temp;
            tail.next = head;
        }
        size--;
    }
    public void deleteAtIdx(int idx){

        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(idx==size-1){
            deleteAtTail();
            return;
        }
        CNode temp = head;
        for(int i = 0 ; i < idx-1 ; i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    public void reverse() {

        // Empty list or one node
        if (head == null || head == tail) {
            return;
        }

        // Break the circle
        tail.next = null;

        // Reverse like a normal linked list
        CNode prev = null;
        CNode curr = head;

        while (curr != null) {

            CNode next = curr.next; //save the next node

            curr.next = prev; //reverse
            prev = curr; //move prev forward
            curr = next; //move curr forward
        }

        // Old head becomes new tail
        CNode temp = head;

        // New head
        head = prev;

        // New tail
        tail = temp;

        // Make it circular again
        tail.next = head;
    }
}

public class DeletionAndReverseOfCL {

}
