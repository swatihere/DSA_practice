package DynamicProgramming;

public class LongestPalindromicSeq {
    public static int longestPalindromicSeq(String s) {
        int n = s.length();
        String rev = "";

        for(int i = n-1; i >= 0; i-- ){
            rev = rev + s.charAt(i);
        }
        int[][] dp = new int[n+1][n+1];

        for(int i = 1; i <= n; i++){   // Compare original string and reversed string
            for(int j = 1; j <= n; j++){
                if(s.charAt(i-1) == s.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    if(dp[i-1][j] > dp[i][j-1]){
                        dp[i][j] = dp[i-1][j];
                    }
                    else{
                        dp[i][j] = dp[i][j - 1];
                    }
                }
            }
        }
        return dp[n][n];
    }
    public static void main(String[] args) {

        String s = "bbbab";

        int ans = longestPalindromicSeq(s);

        System.out.println("Longest Palindromic Subsequence = " + ans);
    }

}
