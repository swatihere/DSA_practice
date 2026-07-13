package Stacks;

import java.util.Stack;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 4};
        int n = arr.length;
        int [] nge = new int[n];
        nge[n-1] =-1;

        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]); //if stack is empty
        // Traverse from right to left
        for(int i=n-2 ; i>=0 ; i--){
            while(st.size()>0 && arr[i]>=st.peek()){   // Remove all smaller or equal elements
                st.pop();
            }
            if(st.size()==0){
                nge[i]=-1;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nge[i] + " ");
        }
    }

}
