package CyclicSort;

public class MissingSmallestPositive {
    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        int n = arr.length;

        while (i < n) {

            int correct = arr[i] - 1;

            if (arr[i] > 0 && arr[i] <= n && arr[i] != arr[correct]) {

                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }

        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};

        System.out.println(firstMissingPositive(arr));
    }
}
