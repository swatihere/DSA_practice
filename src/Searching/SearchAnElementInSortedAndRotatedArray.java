package Searching;

public class SearchAnElementInSortedAndRotatedArray {
     public static void main (String[] args) {
         int[] arr = {4,5,6,7,0,1,2};
         int target = 0;
         int lo = 0 ;
         int hi = arr.length-1;
         int idx = 0;

         while(lo<=hi){
             int mid = lo+(hi-lo)/2;
             if(arr[mid]==target){
                 idx = mid;
                 break;
             }
             //left sorted array
             if(arr[lo]<=arr[mid]){
                 if(target >= arr[lo] && target < arr[mid]){   //tarhet lie between the lo and mid
                     hi = mid-1;
                 }
                 else{
                     lo = mid+1;
                 }
             }

             //for right sorted array
             else {

                 if (target > arr[mid] && target <= arr[hi]) {  //target lie between the mid and high
                     lo = mid + 1;
                 }
                 else {
                     hi = mid - 1;
                 }
             }
         }
         System.out.println(idx);
     }
}
