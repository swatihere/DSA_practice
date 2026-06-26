package Sorting;

public class MovesZeroToEnd {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2 , 0 , 6 , 1 , 0 ,4 , 9 , 0, 11 , 10};
        int n = arr.length;
        print(arr);
        for( int i = 0 ; i < n-1 ; i ++){
            for(int j = 0 ; j< n-1-i ; j ++){
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }

}
