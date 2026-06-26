package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2 , 5 , 7 , 9 , 10 , 13 , 23 , 25, 28 , 34 , 45};
        int target = 9;
        int n = arr.length;
        int lo = 0 ;  //starting element
        int hi = n-1;  //last element
        while(lo<=hi){
            int mid = (lo+hi)/2;  // to find the mid value

            if(arr[mid] == target){
                System.out.println("Element found at index "+mid);
                break;
            }
            else if(arr[mid] < target){
               lo = mid+1;
            }
            else{
                hi = mid-1;
            }

        }
    }
}
