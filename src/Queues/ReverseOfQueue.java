package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseOfQueue {
    public Queue<Integer> reverseQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while(q.size()>0){
            st.push(q.remove());  //queue se remove kr k stack mein dalna
        }
        while(st.size()>0){
            q.add(st.pop());   //stack se remove kr k queue mein dalna
        }
        return q;
    }
    public static void display(Queue<Integer> q) {

        int n = q.size();

        for (int i = 0; i < n; i++) {
            System.out.print(q.peek() + " ");
            q.add(q.poll());
        }

        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        display(q);

        ReverseOfQueue obj = new ReverseOfQueue();

        obj.reverseQueue(q);

        System.out.println("Reversed Queue:");
        display(q);


    }
}
