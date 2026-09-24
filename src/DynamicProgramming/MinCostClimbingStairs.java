package DynamicProgramming;

public class MinCostClimbingStairs {

    // dp array stores already calculated answers
    static int[] dp = new int[100];

    public static int minCost(int[] cost, int n) {

        // If we are at step 0
        if (n == 0) {
            return cost[0];
        }

        // If we are at step 1
        if (n == 1) {
            return cost[1];
        }

        // If answer is already calculated
        if (dp[n] != 0) {
            return dp[n];
        }

        // Come from previous step
        int oneStep = minCost(cost, n - 1);

        // Come from two steps before
        int twoStep = minCost(cost, n - 2);

        // Add current step cost
        int ans = cost[n] + Math.min(oneStep, twoStep);

        // Store the answer
        dp[n] = ans;

        return ans;
    }

    public static void main(String[] args) {

        int[] cost = {10, 15, 20};

        int n = cost.length;

        // We can reach the top from the last step
        // or from one step after the last step
        int ans = Math.min(
                minCost(cost, n - 1),
                minCost(cost, n - 2)
        );

        System.out.println(ans);
    }
}
