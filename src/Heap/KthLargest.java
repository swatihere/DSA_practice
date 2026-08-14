package Heap;

import java.util.PriorityQueue;

public class KthLargest {
    public static int kthLargest(int[] arr, int k){
        //min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
        }
        if(pq.size()>k){
            return pq.peek();
        }
        return pq.peek();
    }
}
