package Stacks;

import java.util.Stack;

public class MinStack {
    //main stack
    Stack<Integer> st;

    //stack to store min values
    Stack<Integer> minSt;

    // Constructor
    public MinStack() {

        st = new Stack<>();
        minSt = new Stack<>();
    }

    public void push(int val) {  //push an element
        st.push(val);

        if(minSt.size()==0 || val <= minSt.peek()){    // If min stack is empty or new value is smaller
            minSt.push(val);
        }

    }
    public void pop() {   //remove the element
        if(st.peek().equals(minSt.peek())){     // If top element is the minimum
            minSt.pop();
        }
        st.pop();
    }
    public int top() {   // Return top element
        return st.peek();
    }
    public int getMin() {// Return minimum element
        return minSt.peek();
    }
    public static void main(String[] args) {

        MinStack obj = new MinStack();

        obj.push(5);
        obj.push(3);
        obj.push(7);
        obj.push(2);

        System.out.println("Top = " + obj.top());
        System.out.println("Minimum = " + obj.getMin());

        obj.pop();

        System.out.println("Top = " + obj.top());
        System.out.println("Minimum = " + obj.getMin());
    }
}
