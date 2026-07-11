package Stacks;

import java.util.Stack;

public class TravesingTheStack {
    public static void main (String[] args){
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);

        while(!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        System.out.println(st2);

        while(!st2.isEmpty()) {
            st1.push(st2.pop());
        }
        System.out.println(st1);
    }
}
