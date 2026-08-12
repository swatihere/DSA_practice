package Heap;

import java.util.PriorityQueue;
public class PriorityQueueSTL {
    public static void main(String[] args) {
        //Min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(5);
        System.out.println(pq.peek());

        pq.add(50);
        System.out.println(pq.peek());

        System.out.println(pq.size());

        System.out.println(pq.remove());

        System.out.println(pq.peek());

        System.out.println(pq);

        for(int ele : pq){
            System.out.print(ele+" ");
        }
    }
}
