package DynamicProgramming;

public class Shortestcommonsubseq {
    public static int shortestCommonSubsequence(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else {
                    if(dp[i - 1][j] > dp[i][j - 1]){
                        dp[i][j] = dp[i - 1][j];
                    }
                    else{
                        dp[i][j] = dp[i][j - 1];
                    }
                }
            }
        }
        return n + m - dp[n][m];  // Length of shortest common supersequence
    }
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "ac";

        int ans = shortestCommonSubsequence(s1, s2);

        System.out.println("Length = " + ans);
    }
}
