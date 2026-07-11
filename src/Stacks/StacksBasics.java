package Stacks;

import java.util.Stack;

public class StacksBasics {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("a");
        st.push("b");
        st.push("c");
        st.push("d");
        System.out.println(st.size());
        System.out.println(st);  //auxiliary space = O(n)

        st.pop();  //it delete the element
        System.out.println(st);
        System.out.println(st.size());

        System.out.println(st.peek());

        System.out.println(st.pop()); //it returns the topmost element and then remove it
        String s = st.pop();

        System.out.println(st);
    }
}
