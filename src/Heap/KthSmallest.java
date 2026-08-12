package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {  //here we use Max Heap
    public static int kthSmallest(int [] arr , int k ) {
        //Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){  //nlogk
            pq.add(ele);

            if(pq.size()>k){
                pq.remove(); //logk
            }
        }
        return pq.peek();
    }
}
