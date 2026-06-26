package Sorting;

public class SelectionSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main (String[] args){
        int[] arr = {2 , 3 , 6 , 1 , 8 ,4 , 9 ,11 , 10};   // find min place it to the first and then compare
        int n = arr.length;
        print(arr);

        for(int i = 0 ; i <n-1; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j = i ; j < n; j++){
                if (arr[j]<min){
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }

        print(arr);

    }
}
