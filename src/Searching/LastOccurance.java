package Searching;

public class LastOccurance {
    public static void main (String[] args){
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int n = arr.length;
        int idx = -1;
        int lo = 0 ;
        int hi = n-1;

        while(lo<=hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < target) {
                lo = mid + 1;
            } else if (arr[mid] > target) {
                hi = mid - 1;
            } else {   //mid==target
                idx = mid;
                lo = mid + 1;
            }
        }
        System.out.print("Last Occurance: " + idx);

    }
}
