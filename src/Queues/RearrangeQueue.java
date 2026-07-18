package Queues;

import java.util.Queue;
import java.util.Stack;

public class RearrangeQueue {
    public static void rearrange(Queue<Integer> q){

        //create a stack
        Stack<Integer> st = new Stack<>();

        int n  = q.size();

        for(int i = 0 ; i < n/2 ; i++){    // Move first half of queue into stack
            st.push(q.poll());  //poll = remove
        }
        while(st.size()>0){    // Put stack elements back into queue --> 40 50 60 30 20 10
            q.add(st.pop());
        }
        // Move first half of queue to the rear --->  30 20 10 40 50 60
        for (int i = 0; i < n / 2; i++) {
            q.add(q.remove());
        }

        // Again move first half into stack
        for (int i = 0; i < n / 2; i++) {
            st.push(q.remove());
        }

        // Interleave stack and queue
        while (st.size() > 0) {
            q.add(st.pop());   // First half element
            q.add(q.remove()); // Second half element
        }

    }
}
