package MapAndSets;

import java.util.HashMap;

public class CountPairInArrayDivisibleByK {
    public static int countPairs(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0 ;

        for (int i = 0; i < arr.length; i++) {
            int rem =  arr[i] % k;   // Find remainder

            int need = (k - rem) % k;   // Find the remainder we need

            if (map.containsKey(need)) {     // If needed remainder already exists
                count = count + map.get(need);    // Add its frequency to count
            }
            if(map.containsKey(need)) {    // Store current remainder
                map.put(count, map.get(need) + 1);  // Increase frequency
            }
            else  {
                map.put(count, 1);
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 5, 7};

        int k = 3;

        System.out.println(countPairs(arr, k));
    }
}
