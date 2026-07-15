package Stacks;

import java.util.Stack;

public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] arr) {

        int n = arr.length;

        Stack<Integer> st = new Stack<>();

        // Next Smaller Element
        int[] nse = new int[n];

        nse[n - 1] = n;
        st.push(n - 1);

        for (int i = n - 2; i >= 0; i--) {

            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.size() == 0) {
                nse[i] = n;
            }
            else {
                nse[i] = st.peek();
            }

            st.push(i);
        }

        // Clear the stack
        while (st.size() > 0) {
            st.pop();
        }

        // Previous Smaller Element
        int[] pse = new int[n];

        pse[0] = -1;
        st.push(0);

        for (int i = 1; i < n; i++) {

            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.size() == 0) {
                pse[i] = -1;
            }
            else {
                pse[i] = st.peek();
            }

            st.push(i);
        }

        // Find Maximum Area
        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            int width = nse[i] - pse[i] - 1;

            int area = arr[i] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 6, 2, 3};

        LargestRectangleInHistogram obj = new LargestRectangleInHistogram();

        int ans = obj.largestRectangleArea(arr);

        System.out.println("Largest Rectangle Area = " + ans);
    }
}