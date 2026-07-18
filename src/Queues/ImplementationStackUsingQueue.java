package Queues;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue{
    Queue<Integer> q = new LinkedList<>();

    void push(int x){
        q.add(x);
        int n = q.size();
        for(int i=0 ; i < n-1 ; i++){
            q.add(q.remove());
        }
    }

    int pop(){
        // Check if stack is empty
        if(q.size() == 0){
            System.out.println("Stack is Empty");
            return -1;
        }
        return q.remove();
    }

    int peek(){
        // Check if stack is empty
        if(q.size() == 0){
            System.out.println("Stack is Empty");
            return -1;
        }
        return q.peek();
    }

    void display() {
        System.out.println(q);
    }
}

public class ImplementationStackUsingQueue {
    public static void main(String[] args) {

        StackUsingQueue st = new StackUsingQueue();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.display();

        System.out.println("Top : " + st.peek());

        System.out.println("Removed : " + st.pop());

        st.display();
    }
}
