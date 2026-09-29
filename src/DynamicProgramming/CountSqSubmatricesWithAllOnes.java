package DynamicProgramming;

public class CountSqSubmatricesWithAllOnes {
    public static int countSquares(int[][] matrix) {
        int n = matrix.length;    // Number of rows
        int m = matrix[0].length;  // Number of columns

        int[][] dp = new int[n][m];    // DP array
        int ans = 0;  // This will store total number of squares

        for (int i = 0; i < n; i++) {  // Traverse every row
            for (int j = 0; j < m; j++) { // Traverse every column

                if (matrix[i][j] == 0) {   // If current cell is 0, no square can be formed here
                    dp[i][j] = 0;
                }
                else if(i==0 || j==0) {    // If it is the first row or first column and the value is 1,
                    dp[i][j] = 1;  // only a 1 x 1 square can be formed
                }
                else {  // If current cell is 1 and it is not in first row/column
                    int min = dp[i - 1][j];   // Take the value from the top

                    if(dp [i][j-1] < min){    // Check the left value
                        min = dp[i - 1][j];
                    }
                    if(dp[i-1][j-1] < min){    // Check the diagonal value
                        min = dp[i-1][j-1];
                    }
                    dp[i][j] = min + 1;   // Add 1 for the current cell
                }
                ans = ans + dp[i][j];    // Add current dp value to answer
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        // Given matrix
        int[][] matrix = {
                {1, 0, 1, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1}
        };

        // Call the function
        int answer = countSquares(matrix);

        // Print the answer
        System.out.println("Total square submatrices = " + answer);
    }
}
