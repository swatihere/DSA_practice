package Heap;

import java.util.PriorityQueue;

public class MinimalCostOfRopes {
    public static int minCost(int[] ropes){
        //Create a min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //Add all ropes to the heap
        for(int rope : ropes){
            pq.add(rope);
        }
        int cost = 0;

        //continue until only one rope is left
        while(pq.size() > 1){

            // Take the two smallest ropes
            int first = pq.remove();
            int second = pq.remove();

            int sum = first + second;  //cost

            cost = cost + sum; //Add the cost

            pq.add(sum); //put the nearly connected rope back
        }
        return cost;
    }
    public static void main(String[] args) {

        int[] ropes = {4, 3, 2, 6};

        int ans = minCost(ropes);

        System.out.println("Minimum cost = " + ans);
    }
}
