package DynamicProgramming;

public class NthFibonacciNum {

    static int[] dp = new int[100];   // dp array stores already calculated answers

    public static int fibo (int n){
        if(n<=1){
            return n;
        }
        if(dp[n]!=0){   // If answer is already calculated, use it
            return dp[n];
        }
        int ans = fibo(n-1) + fibo(n-2);   // Calculate Fibonacci number
        dp[n] = ans;    // Store answer in dp array
        return ans;
    }
    public static void main(String[] args) {

        // Find 5th Fibonacci number
        int n = 5;

        System.out.println(fibo(n));
    }
}
