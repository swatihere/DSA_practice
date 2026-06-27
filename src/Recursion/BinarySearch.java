package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;
        int ans = binarysearch(arr , 0 , arr.length-1 , target);
        System.out.println(ans);
    }
    public static int binarysearch(int[] arr, int lo, int hi, int target){
        if(lo>hi){
            return -1;
        }
        int mid = lo + (hi - lo) / 2;

        if(arr[mid] == target){
            return mid;
        }
        else if(target < arr[mid]){
            return binarysearch(arr, lo, mid-1, target);
        }
        else {
            return binarysearch(arr, mid+1, hi, target);
        }
    }
}
