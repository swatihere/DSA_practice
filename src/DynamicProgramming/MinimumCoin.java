package DynamicProgramming;

public class MinimumCoin {
    public static int minCoins(int[] coins, int amount) {
        int n = coins.length;

        int[][] dp = new int[n + 1][amount + 1];   // Create dp array

        for(int i = 0; i <= n; i++){  // If amount is 0, 0 coins are needed
            dp[i][0] = 1;
        }
        for(int j = 1; j <= amount; j++){   // If there are no coins, amount cannot be made
            dp[0][j] = 1000;
        }
        for(int i = 1; i <= n; i++){   // Start from first coin
            for(int j = 1; j <= amount; j++){   // Check every amount
                if(j >= coins[i-1]){  // If coin can fit

                    int pick = 1 + dp[i-1][j - coins[i-1]]; // If coin can fit
                    int skip = dp[i-1][j];   // Skip the coin

                    if(pick < skip){
                        dp[i][j] = pick;
                    }
                    else {
                        dp[i][j] = skip;
                    }
                }
                else{   // If coin cannot fit
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        if(dp[n][amount] > amount){
            return -1;
        }
        return dp[n][amount];
    }
    public static void main(String[] args) {

        int[] coins = {1, 2, 5};

        int amount = 11;

        int ans = minCoins(coins, amount);

        System.out.println("Minimum coins = " + ans);
    }
}
