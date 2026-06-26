package Arrays;

import java.util.Arrays;

public class SortArrayBuiltin {
    public static void main(String[] args) {
        int[] arr = new int[] {1,8,3,9,6,5,7,2,4,10};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
