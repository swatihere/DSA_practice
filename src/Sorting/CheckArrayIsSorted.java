package Sorting;

public class CheckArrayIsSorted {
    public static void main(String[] args){
        int[] arr = {1 , 4 , 5 , 8 ,6 , 9};
        boolean flag = true;

        for(int i = 0 ; i <= arr.length - 1 ; i ++){
            if(arr[i]<arr[i+1]){
                flag = false;
                break;
            }
        }

        if(flag) {
            System.out.println("Array is sorted");
        }
            else{
                System.out.println("Array is not sorted");
            }
    }
}
