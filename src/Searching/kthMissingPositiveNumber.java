package Searching;

public class kthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;

        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        System.out.println(lo + k);
    }
}
