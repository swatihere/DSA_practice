package Searching;

public class SingleAmongDoubleArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5,5};
        int lo = 0;
        int hi = arr.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (mid % 2 == 1) {
                mid--;      // make mid even
            }

            if (arr[mid] == arr[mid + 1]) {
                lo = mid + 2;
            } else {
                hi = mid;
            }
        }

        System.out.println(arr[lo]);

    }
}
