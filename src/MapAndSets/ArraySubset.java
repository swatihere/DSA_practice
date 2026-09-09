package MapAndSets;

import java.util.HashMap;

public class ArraySubset {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 5};

        HashMap<Integer, Boolean> map = new HashMap<>();

        for(int i = 0 ; i < arr1.length; i++){
            map.put(arr1[i], true);  // Store elements of arr1
        }
        boolean isSubset = false;

        for(int i = 0 ; i < arr2.length; i++){
            if(!map.containsKey(arr2[i])){
                isSubset = false;
                break;
            }
        }
        System.out.println(isSubset);

    }

}
