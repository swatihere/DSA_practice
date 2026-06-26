package Sorting;

import java.util.Arrays;

public class kthElement {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 1, 5};
        int k = 3;

        Arrays.sort(arr);

        System.out.println(arr[k - 1]);

    }
}
