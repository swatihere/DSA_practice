package Arrays;

public class Segregate0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 0, 1};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (arr[left] == 0 && left < right) {
                left++;
            }

            while (arr[right] == 1 && left < right) {
                right--;
            }

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
