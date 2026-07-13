package Stacks;

import java.util.Stack;

public class BaseballGame  {
    public static int calPoints(String[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for(int i=0 ; i<n ; i++){ //traverse all operations
            String s =  arr[i];

            // If operation is "C", remove the last score
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){ // If operation is "D", double the last score
                st.push(2*st.peek());
            }
            else if(s.equals("+")){
                int first = st.pop();  // Remove the top score temporarily
                int second = st.peek();  // Get the second top score
                int sum = first + second;
                st.push(first);
                st.push(sum);
            }
            else{   // Otherwise, it is a number
                st.push(Integer.parseInt(s));  // Convert String to Integer and push into stack
            }
        }
        int sum = 0;
        while(st.size()!=0){
            sum+=st.pop();
        }
        return sum;
    }
    public static void main(String[] args) {

        String[] operations = {"5", "2", "C", "D", "+"};

        System.out.println(calPoints(operations));
    }
}
