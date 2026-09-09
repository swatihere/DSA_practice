package Heap;

import java.util.HashMap;
import java.util.PriorityQueue;

class Element implements Comparable<Element>{
    int val ;
    int freq;
    public Element(int val, int freq){  //constructor
        this.val = val;
    }
    public int compareTo(Element e){
        return this.freq-e.freq; //smaller freq gets higher priority
    }
}

public class TopKFrequent {
    public static void main (String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();
        // Count frequency of every element
        for (int ele : arr) {

            if (map.containsKey(ele)) {

                // Increase frequency
                map.put(ele, map.get(ele) + 1);
            }
            else {
                // First occurrence
                map.put(ele, 1);
            }
        }
        PriorityQueue<Element> pq = new PriorityQueue<>();
        // Add each element with its frequency
        for (int ele : map.keySet()) {

            int freq = map.get(ele);

            pq.add(new Element(ele, freq));

            // We only need k elements
            if (pq.size() > k) {

                // Remove the element
                // having the smallest frequency
                pq.remove();
            }
        }

        // Print top k frequent elements
        while (!pq.isEmpty()) {

            Element e = pq.remove();
            System.out.println(e.val + " -> " + e.freq);
        }

    }
}
