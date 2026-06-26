package Searching;

public class DescendingOrder {
    public static void main(String[] args) {
        int[] arr = {20, 18 , 16 , 15, 12, 10, 7 , 8, 5, 2};
        int target = 10;
        int n = arr.length;
        int lo = 0;
        int hi = n-1;

        while (lo <= hi) {
            int mid = (lo+hi)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<target){
                hi = mid +1;
            }
            else{
                lo = mid - 1;
            }
        }
    }
}
