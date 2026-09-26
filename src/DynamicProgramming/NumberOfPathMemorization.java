package DynamicProgramming;

public class NumberOfPathMemorization {
    static int[] dp = new int[100];
    public static int paths(int n){
        if(n==0){
            return 1;
        }
        if(n < 0){    // If n becomes negative, there is no way
            return 0;
        }
        if(dp[n]!=0){    // If answer is already stored, return it
            return dp[n];
        }
        int ans = paths(n-1) + paths(n-2);

        dp[n] = ans;
        return ans;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(paths(n));
    }
}
