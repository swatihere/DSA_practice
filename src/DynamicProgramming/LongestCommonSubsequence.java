package DynamicProgramming;

public class LongestCommonSubsequence {
    public static int lcs (String s1, String s2) {
        int n =  s1.length();
        int m = s2.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {   // Traverse both strings
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) { // If characters are same
                    dp[i][j] = 1 + dp[i - 1][j - 1] ;
                }
                else {    // If characters are different
                    if(dp[i - 1][j - 1] > dp[i][j-1] ){
                        dp[i][j] = dp[i-1][j];
                    }
                    else{
                        dp[i][j] = dp[i][j - 1];
                    }
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {

        String s1 = "abcde";
        String s2 = "ace";

        int ans = lcs(s1, s2);

        System.out.println("LCS length = " + ans);
    }
}
