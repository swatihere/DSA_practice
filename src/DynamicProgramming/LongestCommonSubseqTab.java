package DynamicProgramming;

public class LongestCommonSubseqTab {
    public static void lcs(String s1 , String s2) {
        int n  = s1.length();
        int m = s2.length();

        int[][] dp = new int[n + 1][m + 1];  // dp[i][j] stores the length of LCS

        // Fill the DP table
        for(int i = 1 ; i <= n ; i ++){
            for(int j = 1 ; j <= m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){   // If current characters are same
                    dp[i][j] = dp[i-1][j-1] + 1;    // Add 1 to the diagonal value
                }
                else{
                    int a = dp[i-1][j]; // Value from top
                    int b = dp[i][j-1];  // Value from left

                    // Take the bigger value
                    if(a>b){
                        dp[i][j]= a;
                    }
                    else{
                        dp[i][j]= b;
                    }
                }
            }
        }
        int i = n ;
        int j = m ;

        StringBuilder ans = new StringBuilder();    // StringBuilder is used to store the LCS
        // Move backwards in the DP table
        while (i > 0 && j > 0) {

            // If characters are same
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

                // Add this character to answer
                ans.append(s1.charAt(i - 1));

                // Move diagonally
                i--;
                j--;

            } else {

                // If top value is bigger
                if (dp[i - 1][j] > dp[i][j - 1]) {

                    // Move up
                    i--;

                } else {

                    // Move left
                    j--;
                }
            }
        }
        ans.reverse();

        System.out.println("LCS length = " + dp[n][m]);
        System.out.println("LCS = " + ans);
    }
    public static void main(String[] args) {

        String s1 = "abcde";
        String s2 = "ace";

        lcs(s1, s2);
    }

}
