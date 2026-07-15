package Stacks;

import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int n = price.length;

        int[] span =  new int[n];

        // Stack stores INDEXES
        Stack<Integer> st = new Stack<>();

        //first elem
        span[0] = 1;
        st.push(0);

        // Traverse from left to right
        for(int i=1 ; i<n ; i++){
            //remove all smaller or equal prices
            while (st.size() > 0 && price[i] >= price[st.peek()]) {
                st.pop();
            }
            //if stack become empty
            if(st.size()==0){
                span[i] = i + 1;
            }
            else{
                span[i] = i - st.peek();
            }
            // Push current index
            st.push(i);
        }
        // Print answer
        for (int i = 0; i < n; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
