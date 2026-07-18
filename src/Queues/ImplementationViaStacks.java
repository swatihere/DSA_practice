package Queues;

import java.util.Stack;

class QueueUsingStacks {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

                            //ADD
    void push(int val) {
        while(st1.size()>0){
            st2.push(st1.pop());
        }
        st1.push(val);

        while(st2.size()>0){
            st1.push(st2.pop());
        }
    }
                                     //REMOVE
    int pop() {
        if(st1.size()==0){
            System.out.println("Queue is empty");
            return -1;
        }
        return st1.pop();
    }
                                        //PEEK
    int peek() {
        if(st1.size()==0){
            System.out.println("Queue is empty");
            return -1;
        }
        return st1.peek();
    }
                                         //DISPLAY
     void display() {
         System.out.println(st1);
     }
}

public class ImplementationViaStacks {
    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.push(10); //bottom
        q.push(20);
        q.push(30);
        q.push(40);  //top

        q.display();

        System.out.println(q.pop());
        q.display();

    }
}
