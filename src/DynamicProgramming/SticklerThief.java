package DynamicProgramming;

public class SticklerThief {
    static int[] dp ;

    public static int solve(int[] arr, int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return arr[0];
        }
        if(dp[n] != 0){    // If answer is already calculated
            return dp[n];
        }
        int pick = arr[n-1] + solve(arr, n-2);   // Pick the current element

        int skip = solve(arr, n-2);     // Skip the current element

        int ans = Math.max(pick, skip);    //Take the bigger answer

        dp[n] = ans;  //store ans
        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {2, 7, 9, 3, 1};

        // Find maximum sum
        int ans = solve(arr, arr.length);

        System.out.println(ans);
    }
}
