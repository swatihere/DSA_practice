package Queues;
import java.util.LinkedList;
import java.util.Queue;

public class TraversalQueue {
                                     //ADD AT ANY INDEX IN QUEUE
    private static void addAtIndex( Queue<Integer> q ,  int idx , int val){
        if(idx<0 || idx > q.size()){
            System.out.println("Index out of bounds");
            return;
        }
        int n = q.size();
        for(int i = 1 ; i <= idx ; i++){
            q.add(q.poll());
        }
        q.add(val);
        for(int i = 1 ; i <= n - idx ; i++){
            q.add(q.poll());
        }
    }
                                          //PEEK AT ANY INDEX
    private static int peekAtIndex( Queue<Integer> q , int idx ){
        if (idx < 0 || idx >= q.size()) {
            System.out.println("Index out of bounds");
            return -1;
        }
        int n = q.size();
        for(int i = 1 ; i <= idx ; i++){
            q.add(q.poll());
        }
        int ele = q.peek();

        for(int i = 1 ; i <= n - idx ; i++){
            q.add(q.poll());
        }
        return ele;
    }
                           //REMOVE AT ANY INDEX
   private static void removeAtIndex(Queue<Integer> q, int idx) {

       if (idx < 0 || idx >= q.size()) {
           System.out.println("Index out of bounds");
           return;
       }

       int n = q.size();

       // Move first idx elements
       for (int i = 1; i <= idx; i++) {
           q.add(q.poll());
       }

       // Remove the required element
       q.poll();

       // Restore the queue
       for (int i = 1; i <= n - idx - 1; i++) {
           q.add(q.poll());
       }
   }

    //using of display method
    private static void display(Queue<Integer> q){
        int n = q.size();
        for(int i = 0; i < n; i++){
           System.out.print(q.peek()+" ");
            q.add(q.poll()); //poll is remove in queue
        }
        System.out.println();

    }
    public static void main (String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        //for Traversal 1st method
        //int n = q.size();
//        for(int i = 0; i < n; i++){
//            System.out.print(q.peek()+" ");
//            q.add(q.poll()); //poll is remove in queue
//        }
         display(q);

         addAtIndex(q,2,60);
         display(q);

        int ele = peekAtIndex(q, 5);
        System.out.println("Element at index 5 = " + ele);

        removeAtIndex(q,5);
        display(q);
    }
}
