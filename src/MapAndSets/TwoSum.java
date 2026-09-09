package MapAndSets;
import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        HashSet<Integer> set = new HashSet<>();
        Boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int need =  target - arr[i];

            if(set.contains(need)){
                found = true;
                break;
            }
            set.add(arr[i]);
        }
        System.out.println(found);
    }
}
