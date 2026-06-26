package Searching;

public class FloorInSortedarray {
public static void main(String[] args) {
    int[] arr = {2, 3, 5, 8, 9, 9 , 14, 16 , 18 , 20};
    int x = 9;
    int n = arr.length;

    int lo = 0;
    int hi = n - 1;
    int idx = -1;

    while (lo <= hi) {
        int mid = (lo + hi) / 2;

        if (arr[mid] == x) {
            idx = mid;
            lo = mid + 1;
        }
        else if (arr[mid] < x) {
            lo = mid + 1;
        }
        else {
            hi = mid - 1;
        }
    }

    System.out.println(idx);
}
}
