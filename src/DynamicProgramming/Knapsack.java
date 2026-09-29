package DynamicProgramming;

public class Knapsack {
    public static int knapsack(int[] val, int[] wt, int capacity, int i, int[][]dp) {
        if (i == val.length) {   // If all items are checked
            return 0;
        }
        if (dp[i][capacity] != 0) {  // If answer is already calculated
            return dp[i][capacity];
        }
        if(wt[i]>capacity){   // Skip the item
            dp[i][capacity] = knapsack(val, wt, capacity, i + 1, dp);
            return dp[i][capacity];
        }
        int pick = val[i] + knapsack(val, wt, capacity - wt[i], i + 1, dp); // Pick the current item (i+1)

        int skip =  knapsack(val, wt, capacity, i + 1, dp);   // Skip the current item

        // Store maximum of pick and skip
        if(pick>skip){
            dp[i][capacity] = pick;
        }
        else{
            dp[i][capacity] = skip;
        }
        return dp[i][capacity];
    }
    public static void main(String[] args) {

        int[] val = {1, 4, 5, 7};
        int[] wt = {1, 3, 4, 5};

        int capacity = 7;

        // Create DP array
        int[][] dp = new int[val.length][capacity + 1];

        // Start from index 0
        int ans = knapsack(val, wt, capacity, 0, dp);

        System.out.println("Maximum value = " + ans);
    }
}
