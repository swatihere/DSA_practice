package DynamicProgramming;

public class NthFibonacciNumTabulation {
    public static void main(String[] args) {
        int n = 5 ;
        int[] dp = new int[n+1] ;   // Create dp array  //If you need dp[n] use new int[n + 1]

        //base case
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <=n ; i++) {   // Calculate Fibonacci numbers
            dp[i] = dp[i-1] + dp[i-2];    // Current = previous + previous previous
        }
        System.out.println(dp[n]);
    }
}
