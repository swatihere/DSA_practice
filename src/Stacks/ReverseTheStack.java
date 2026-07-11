package Stacks;

import java.util.Stack;

public class ReverseTheStack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new  Stack<>();
        Stack<Integer> st2 = new  Stack<>();
        Stack<Integer> st3 = new  Stack<>();

        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);

        System.out.println("Original Stack" + st1);

        //st1---> st2
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        //st2--->st3
        while (!st2.isEmpty()) {
            st3.push(st2.pop());
        }
        //st3--->st1
        while (!st3.isEmpty()) {
            st1.push(st3.pop());
        }
        System.out.println("Reversed Stack" + st1);

    }
}
