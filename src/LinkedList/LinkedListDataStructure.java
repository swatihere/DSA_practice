package LinkedList;
class Node {  //User Defined Data Type
    int val;
    Node next;
    Node(int val){  //Constructor
        this.val = val ;
    }
}
class Linkedlist{  //User Defined Data Structure
    Node head;
    Node tail;
    int size;

    int search(int val){             //SEARCHING
        if(head == null){
            return -1;
        }
        Node temp = head;
        int idx= 0 ;
        while(temp != null){
            if(temp.val == val){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    void addAtHead(int val){          //ADD AT HEAD
        Node temp = new Node(val); //Made a temporary Node
        if(head == null){
            head = tail = temp ;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;

    }

    void addAtTail(int val){            //ADD AT TAIL
        Node temp = new Node(val);  //Make a new node
        if(tail == null){
            head = tail = temp;
        }
        else{
            tail.next = temp;        //Giving the temp value to the next tail
            tail = temp;             //Now the temp is new Tail
        }
        size++;
    }
    void deleteAtHead(){            //DEL AT HEAD
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        head = head.next;
        if(head == null){
            tail = null;  //for one size array
        }
        size--;
    }

    public void insert(int val, int idx) {           //INSERT AT ANY INDEX
        if(idx < 0 || idx >size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx == 0) {
            addAtHead(val);
        }
            else if (idx == size){
                addAtTail(val);
            }
            else{
                Node temp = head;
                for(int i=0 ; i < idx-1 ;i++){
                    temp = temp.next;
                }
                Node t =  new Node(val);  //create a new node
                t.next = temp.next;
                temp.next = t;
                size++;
        }
    }
    void delete(int idx) {
        if(idx < 0 || idx >= size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx == 0){
            deleteAtHead();
            return;
        }
        Node temp = head;
        for(int i = 0 ; i<= idx-1 ; i ++){
            temp = temp.next;
        }
        temp.next = temp.next.next; //delete
        if(idx == size-1){
            tail = temp;  //we are deleting tail
        }
        size--;
    }

    void display(){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}


public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(50);
        ll.addAtTail(60);
        ll.addAtTail(70);
        ll.addAtTail(80);
        ll.display();

        ll.addAtHead(100);
        ll.display();

        ll.deleteAtHead();
        ll.display();

        ll.insert(40,2);
        ll.display();

        ll.delete(3);
        ll.display();
    }
}
