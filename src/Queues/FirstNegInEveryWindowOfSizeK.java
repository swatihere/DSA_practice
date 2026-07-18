package Queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegInEveryWindowOfSizeK {
    static List<Integer> firstNegative (int arr[] , int k ){
        List<Integer> ans = new ArrayList<Integer>();

        int n = arr.length;
        Queue<Integer> q = new LinkedList<Integer>();  // Queue stores the indices of negative elements
        for(int i = 0; i < n; i++){       // Store indices of all negative numbers
           if(arr[i] < 0 ){
               q.add(i);
           }
        }
        for(int i = 0; i < n-k+1 ; i++){
            //window is from i to i+k-1
            while( q.size()>0 && q.peek() < i){   // Remove negative indices that are outside the current window
                q.poll();
            }
            if(q.size()>0 && q.peek() <= i+k-1){    // Check if the first negative lies inside the current window
                ans.add(arr[q.peek()]);
            }
            else {
                ans.add(0);
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        List<Integer> ans = firstNegative(arr, k);

        System.out.println(ans);
    }
}
