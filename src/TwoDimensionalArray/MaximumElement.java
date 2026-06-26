package TwoDimensionalArray;

public class MaximumElement {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 5, 3},
                {9, 2, 7},
                {4, 8, 6}
        };

        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Maximum = " + max);
    }
}
