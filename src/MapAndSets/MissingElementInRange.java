package MapAndSets;

import java.util.HashSet;

public class MissingElementInRange {
    public static void main(String[] args) {
        int[] arr = { 10, 11, 13, 14, 16};
        int low = 10;
        int high = 16;

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < arr.length ; i++){  //add all element into the set
            set.add(arr[i]);
        }
        for(int i = low ; i <= high ; i++){

            if(!set.contains(i)){
                System.out.println("Missing element: " + i);
            }
        }
    }

}
