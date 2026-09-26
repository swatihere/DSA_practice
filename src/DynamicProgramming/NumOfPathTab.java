package DynamicProgramming;

public class NumOfPathTab {
    public static void main(String[] args) {
        int n = 4 ;

        int[] dp = new int[n+1] ;  // dp array stores number of paths for each step
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2 ;i<=n;i++){   // Start calculating from step 2
            dp[i] = dp[i-1] + dp[i-2];    // We can reach i by taking 1 step or 2 steps
        }
        System.out.println(dp[n]);
    }
}
