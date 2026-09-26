package DynamicProgramming;

public class MinSumPathTab {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 1}, {1, 5, 1},{4, 2, 1}};

        int n  = arr.length;
        int m = arr[0].length;

        int[][] dp = new int[n][m];    // dp[i][j] stores the minimum sum to reach this cell

        dp[0][0] = arr[0][0];     // Starting cell

        for(int j = 1 ; j < m; j++){      // Fill the first row
            dp[0][j] = arr[0][j] + dp[0][j-1];
        }
        for(int i = 1; i < n; i++){        // Fill the first column
            dp[i][0] = arr[i][0] + dp[i-1][0];
        }
        for(int i = 1; i < n; i++){  // Fill the remaining cells
            for(int j = 1; j < m; j++){
                dp[i][j] = arr[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);   // We can come from top or from left
            }
        }
        System.out.println(dp[n-1][m-1]);
    }
}
