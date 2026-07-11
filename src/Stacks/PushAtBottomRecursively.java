package Stacks;
import java.util.Stack;

public class PushAtBottomRecursively {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10); //Bottom
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50); //Top
        int ele = 60;
        System.out.println(st);
        pushAtBottom(st,ele); //function
        System.out.println(st);
    }
    public static void pushAtBottom(Stack<Integer> st,int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top = st.pop(); //to add ele first we have to remove the top elem
        pushAtBottom(st,ele); //when stack got empty then push the elem
        st.push(top); //call back and push back all the elem
    }
}
