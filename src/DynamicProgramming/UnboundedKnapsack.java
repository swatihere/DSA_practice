package DynamicProgramming;

public class UnboundedKnapsack {
    public static int knapsack(int[] val, int[] wt, int capacity, int i, int[][]dp) {
        if(i==val.length){
            return 0;
        }
        if(dp[i][capacity]!=0){
            return dp[i][capacity];
        }
        if(wt[i] > capacity){    // If current item cannot be picked
            dp[i][capacity] = knapsack(val, wt, capacity, i + 1, dp);   // Skip the item
            return dp[i][capacity];
        }
        int pick = val[i]+ knapsack(val, wt,  capacity - wt[i], i, dp);   // PICK the current item (i)

        int skip =  knapsack(val, wt, capacity, i + 1, dp);  // SKIP the current item

        if(pick>skip){
            dp[i][capacity] = pick;
        }
        else{
            dp[i][capacity] = skip;
        }
        return dp[i][capacity];
    }
    public static void main(String[] args) {

        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};

        int capacity = 7;

        // DP array
        int[][] dp = new int[val.length][capacity + 1];

        // Call helper function
        int ans = knapsack(val, wt, capacity, 0, dp);

        System.out.println("Maximum value = " + ans);
    }
}
