package DynamicProgramming;

public class FriendsPairing {
    public static void main(String[] args) {
        int n = 4;

        int[] dp= new int[n+1];   // dp[i] stores the number of ways for i friends
        dp[0] = 1;            // For 0 friends, there is 1 way
        dp[1] = 1;            // For 1 friend, he can stay single

        for (int i = 2; i <= n; i++) {
            int single = dp[i-1];   // One friend stays single
            int pair = (i-1) * dp [i-2]; // One friend pairs with any of the other friends

            dp[i] = pair + single;    // Total number of ways
        }
        System.out.println(dp[n]);
    }
}

