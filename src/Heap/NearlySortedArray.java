package Heap;
import java.util.PriorityQueue;

public class NearlySortedArray {
    public static void nearlySorted(int[]arr, int k ){
        int idx = 0 ;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //Add first k+1 element
        for(int i = 0 ; i < k && i < arr.length ; i++){
            pq.add(arr[i]);
        }
        // Start from k+1
        for(int i = k+1 ; i < arr.length ; i++){
            int top = pq.remove();  //remove the smallest
            arr[idx++] = top;  //put it in correct position
            pq.add(arr[i]);  //add next element
        }
        //EMPTY THE REMAINING HEAP
        while(!pq.isEmpty()){
            int top = pq.remove();
            arr[idx++] = top;
        }
    }
    public static void main(String[] args) {

        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;

        nearlySorted(arr, k);

        // Print sorted array
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
