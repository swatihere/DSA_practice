package TwoDimensionalArray;

public class MinElementOutOfMax {
    public static void main(String[] args) {

            int[][] arr = {
                    {3, 5, 1},
                    {7, 2, 4},
                    {9, 8, 6}
            };

            int minOfMax = Integer.MAX_VALUE;

            for (int i = 0; i < arr.length; i++) {

                int rowMax = arr[i][0];

                for (int j = 0; j < arr[i].length; j++) {

                    if (arr[i][j] > rowMax) {
                        rowMax = arr[i][j];
                    }
                }

                if (rowMax < minOfMax) {
                    minOfMax = rowMax;
                }
            }

            System.out.println(minOfMax);
        }
    }

