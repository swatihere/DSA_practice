package Arrays;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main (String[] args) {
        int[] arr = {10 , 20 , 30 , 40 , 50 };
        int[] x = arr; //x is the shallow copy of arr
        x[0]=100;
        System.out.println(arr[0]);  //100

        int[] y = Arrays.copyOf(arr, arr.length);  //deep copy
        y[0]=100;
        System.out.println(y[0]);    //100
        System.out.println(arr[0]);  //10
    }
}
