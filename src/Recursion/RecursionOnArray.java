package Recursion;

public class RecursionOnArray {
    public static void main (String[] args){
        int []arr = { 2 , 4, 5, 6, 3, 8 , 9 , 10};
        recPrint(arr,0);
    }
    public static void recPrint(int[] arr, int index){
        if(index == arr.length){
            return;
        }
        System.out.print(arr[index]+" ");
        recPrint(arr, index+1);

//        recPrint(arr, index+1);
//        System.out.print(arr[index]+" ");  //to print reverse of the num
    }
}
