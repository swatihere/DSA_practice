package DynamicProgramming;

public class MinCostClimbingStairsTab {
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        int n = cost.length;

        int[] dp = new int[n];  // dp[i] means minimum cost to reach step i
        dp[0] = cost[0];  // First step cost
        dp[1] = cost[1];  // Second step cost

        for (int i = 2; i < n; i++) {
            int oneStep = dp[i-1];  // We can come from one step before
            int twoStep = dp[i-2];  // Or we can come from two steps before

            dp[i] = cost[i] + Math.min(oneStep, twoStep);  // Choose the smaller cost
        }
        int ans = Math.min(dp[n-1], dp[n-2]);

        System.out.println(ans);
    }
}
