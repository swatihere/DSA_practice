package Searching;

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 6, 4, 2};
        int n = arr.length;
        int lo = 1; // first element can never be peak
        int hi = n-2; //last element can never be peak

        while(lo<=hi){
            int mid = (lo+hi)/2;
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) { //mid-1 before mid and mid+1 after mid
                System.out.println(arr[mid]);
                break;
            }
            else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
                lo = mid+1;
            }
            else {
                hi = mid-1;
            }
        }

    }
}
