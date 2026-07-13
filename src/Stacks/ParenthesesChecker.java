package Stacks;

import java.util.Stack;

public class ParenthesesChecker {
    public static boolean checkParentheses(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else {
                if(st.size()==0){
                    return false;
                }
                char top = st.peek();
                if(sameStyle(top,ch)){
                    st.pop();
                }
                else {
                    return false;
                }
            }
        }
        return (st.size()==0);
    }
    public static boolean sameStyle(char open, char close) {

        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    public static void main(String[] args) {

        String str = "{[()]}";

        System.out.println(checkParentheses(str));
    }
}
