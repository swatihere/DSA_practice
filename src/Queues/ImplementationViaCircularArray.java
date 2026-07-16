package Queues;
class CircularQueue{
    int[] arr;
    int f;
    int r;
    int size;
    CircularQueue (int capacity){  //constructor
        arr = new int[capacity];
    }
    void add(int val){                 //ADD
        if(size == arr.length){
            System.out.println("QUEUE IS FULL");
            return;
        }
        arr[r] = val;
        r++;
        if(r == arr.length){
            r=0;
        }
        size++;
    }
    int remove(){                             //REMOVE
        if(size == arr.length){
            System.out.println("QUEUE IS EMPTY");
            return -1;
        }
        int frontVal = arr[f];
        f++;
        if(f == arr.length){
            f=0;
        }
        size--;
        return frontVal;
    }
    int peek(){                                 //PEEK
        if(size == arr.length){
            System.out.println("QUEUE IS EMPTY");
            return -1;
        }
        return arr[f];
    }
    void display(){
        if(size == 0){
            return;
        }
        if(f >= r){
            for(int i = f; i <= arr.length ; i++){  //print from ffront to end
                System.out.print(arr[i]+" ");
            }
            for(int i = 0; i < r ; i++){   //start to rear-1
                System.out.print(arr[i]+" ");
            }
        }
        else{
            for(int i = f; i <= r ; i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}

public class ImplementationViaCircularArray {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
    }
}

