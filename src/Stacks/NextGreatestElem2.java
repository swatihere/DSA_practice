package Stacks;

import java.util.Stack;

public class NextGreatestElem2 {
    public int [] nextGreaterElements(int [] arr){
        int n = arr.length;
        int[] nge = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i=n-1 ; i>=0 ; i--){
            st.push(arr[i]);
        }

        for(int i=n-1 ; i>=0 ; i--){

            while(st.size()>0 && st.peek() <= arr[i]){
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
        return nge;
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 1};

        NextGreatestElem2 obj = new NextGreatestElem2();

        int[] ans = obj.nextGreaterElements(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
