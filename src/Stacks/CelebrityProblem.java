package Stacks;

import java.util.Stack;

public class CelebrityProblem {
    public int celebrity(int arr[][]){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){  //push all person into stack
            st.push(i);
        }
        // Remove non-celebrities
        while (st.size() > 1) {
            // Take two persons from the stack
            int a = st.pop();
            int b = st.pop();
            // If a knows b, then a cannot be a celebrity
            if (arr[a][b] == 1) {
                st.push(b);
            }
            // Otherwise b cannot be a celebrity
            else {
                st.push(a);
            }
        }

        if (st.size() == 0) {  // If the stack becomes empty, no celebrity exists
            return -1;
        }
        int celeb = st.pop(); // Possible celebrity

        // Check if celebrity knows anyone
        for(int j = 0; j < n; j++){
            if(j == celeb){
                continue;
            }

            if(arr[celeb][j]==1){  // Celebrity should not know anyone
                return -1;
            }
        }
        // Check if everyone knows the celebrity
        for(int i = 0; i < n; i++){
            if(i == celeb){
                continue;
            }

            if(arr[i][celeb]==0){  // If anyone does not know the celebrity
                return -1;
            }
        }
        return celeb;
    }
    public static void main(String[] args) {

        int[][] arr = {
                {0, 1, 1},
                {0, 0, 1},
                {0, 0, 0}
        };

        CelebrityProblem obj = new CelebrityProblem();

        int ans = obj.celebrity(arr);

        if (ans == -1) {
            System.out.println("No Celebrity");
        } else {
            System.out.println("Celebrity is Person " + ans);
        }
    }
}
