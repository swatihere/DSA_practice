package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class KthReverseOfQueue {
public static Queue<Integer> reverseK(Queue<Integer> q , int k) {
    //check if k is vaild
    if(k <= 0 || k > q.size()) {
        System.out.println("k out of bound");
        return q ;
    }

    Stack<Integer> st = new Stack<>();

    int n = q.size();

    // Push first k elements into stack
    for (int i = 1; i <= k; i++) {
        st.push(q.poll());
    }

    // Add stack elements back to queue
    while (st.size() > 0) {
        q.add(st.pop());
    }

    // Move remaining elements to the back
    for (int i = 1; i <= n - k; i++) {
        q.add(q.poll());
    }

    return q;
}
    // Display Queue
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

        System.out.println("Original Queue:");
        display(q);

        reverseK(q, 3);

        System.out.println("After Reversing First 3 Elements:");
        display(q);
    }
}
