package CyclicSort;

public class DuplicateValue {
    public static int findDuplicate(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                if (i != correct) {
                    return arr[i];
                }
                i++;
            }
        }

        return -1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};

        int duplicate = findDuplicate(arr);

        System.out.println("Duplicate number = " + duplicate);
    }
}
