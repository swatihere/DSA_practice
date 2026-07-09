package DoublyLinkedList;
class DNode{
    int val;
    DNode next;
    DNode prev;
    DNode child;

    DNode(int val){
        this.val = val;
    }
}
class DLL{
    DNode head;
    DNode tail;
    int size ;

    void insertAtHead(int val){   //To insert at Head
        DNode temp = new DNode(val);
        if(head == null){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertAtTail(int val){   //to insert at the Tail
        DNode temp = new DNode(val);
        if(tail == null){
            tail = head = temp;
        }
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void deleteAtHead(){       //Delete at head
        if(size == 0){
            System.out.println("List is empty");
            return;
        }
        if(size == 1){
            head = tail = null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    void deleteAtTail(){      //delete at tail
        if(size == 0){
            System.out.println("List is empty");
            return;
        }
        if(size == 1){
            tail = head = null;
        }
        else{
            tail = tail.prev;
            tail.next = null;
        }
    }

    void insert(int idx , int val){   //insert at any position
        if(idx < 0 || idx > size){
            System.out.println("Invalid index");
            return;
        }
        if(idx == 0){
            insertAtHead(val);
            return;
        }
        if(idx == size){
            insertAtTail(val);
            return;
        }

        DNode temp = head ;
        for(int i = 0; i < idx - 1; i++){
            temp = temp.next;
        }
        DNode a = new DNode(val);

        a.next = temp.next;
        a.prev = temp;

        temp.next.prev = a;
        temp.next = a;

        size++;
    }

    void display(){
        DNode temp = head ;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayReverse(){
        DNode temp = tail;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}

public class DoublyBasic {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.insertAtHead(4);

        list.display();

        list.insertAtTail(5);
        list.display();

        list.displayReverse();

        list.deleteAtHead();
        list.display();

        list.deleteAtTail();
        list.display();

        list.insert(2,10);
        list.display();
    }
}
