package DynamicProgramming;

import java.util.Scanner;

public class CountDerangements {
    static int countDer(int n ){
        if(n == 1) return 0;
        if(n == 2) return 1;

        int[] dp  = new int[n+1];    // Create dp array

        dp[1] = 0;
        dp[2] = 1;
        for(int i = 3; i <= n; i++){
            dp[i] = (i - 1) * (dp[i - 1] + dp[i - 2]);   // Calculate derangements
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDer(n));
    }
}
