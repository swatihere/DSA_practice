package Searching;

public class FloorSqRoot {
    public static void main (String[] args) {
        int[] arr = {1 , 2, 3 , 4 ,5, 6, 7,8, 9, 10 ,11, 12, 13, 14 ,15};
        int n = arr.length;
        int lo= 0 ;
        int hi = n;
        int idx = 0;

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;

            if ((long) mid * mid <= n) {
                idx = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        System.out.println(idx);
    }

}
