package MapAndSets;

import java.util.HashMap;

public class PairsWithDifferenceK {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);     // If element is already present, increase its count
            }
            else{
                map.put(arr[i], 1);  // If element is not present, add it with count 1
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int need = arr[i] + k;

            if(map.containsKey(need)){
                System.out.println(arr[i]+" "+need);

            }
        }
    }
}
