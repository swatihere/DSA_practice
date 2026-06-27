package Recursion;

public class FindEleInArray {
    public static void main (String[] args) {
        int []arr = { 2 , 4, 5, 6, 3, 8 , 9 , 10};
        int target = 9;
        System.out.println(exists(arr,target,0));
    }
    public static boolean exists(int[] arr, int target, int idx){
        if(idx == arr.length){
            return false;
        }
        if(arr[idx] == arr.length){
            return true;
        }
        return exists(arr,target,idx+1);
    }
}
