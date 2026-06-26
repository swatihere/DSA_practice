package TwoDimensionalArray;

public class MultiplyingMatrix {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2},
                {3, 4}
        };

        int[][] B = {
                {5, 6},
                {7, 8}
        };

        int r1 = A.length;
        int c1 = A[0].length;
        int c2 = B[0].length;

        int[][] ans = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

