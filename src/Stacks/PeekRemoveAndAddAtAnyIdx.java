package Stacks;

import java.util.Stack;

public class PeekRemoveAndAddAtAnyIdx {
    public static void main(String[] args) {

        int idx = 2;
        int value = 70;
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);
        st1.push(60);

        //peek
        System.out.println(st1.peek());
        System.out.println(st1);

                                      //Remove at any next
        //move top elements
        while(st1.size()>idx+1){
            st2.push(st1.pop());
        }
        //remove the element
        st1.pop();

        //put the element back
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        System.out.println(st1);

                                   //Add any Index
        //move top element
        while(st1.size() > idx){
            st2.push(st1.pop());
        }
        //insert
        st1.push(value);

        //restore
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        System.out.println(st1);


    }
}
