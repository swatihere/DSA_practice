package DynamicProgramming;

public class SticklerThiefTabulation {
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 3, 1};
        int n = arr.length;  //storing the size

        int[] dp = new int[n];  //If you only need dp[0] to dp[n-1] → use new int[n]

        dp[0] = arr[0];   // First house
        dp[1] = Math.max(arr[0], arr[1]); //Second house

        for (int i = 2; i < n; i++) {    // Start from third house
            int pick = arr[i] + dp[i-2];    // Pick current house
            int skip = dp[i-1];   // Skip current house

            dp[i] = Math.max(pick, skip);   // Choose maximum

        }
        System.out.println(dp[n-1]);
    }
}
