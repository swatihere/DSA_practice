package DynamicProgramming;

public class EditDistance {
    public static int editDistance(String a, String b) {
        int n = a.length();
        int m = b.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {  //if b is empty delete all char from a
            dp[i][0] = i;
        }
        for (int j = 1; j <= m; j++) { //if a is empty delete all the char from b
            dp[0][j] = j;
        }
        //Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // Characters are same, so no operation is needed
                }
                else {
                    //insert
                    int insert = dp[i][j-1];

                    //delete
                    int delete = dp[i - 1][j];

                    //replace
                    int replace = dp[i - 1][j - 1];

                    int min = insert;  //find the minimum operation

                    if(delete < min) {
                        min = delete;
                    }
                    if(replace < min) {
                        min = replace;
                    }
                    dp[i][j] = 1 + min;
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s1 = "horse";
        String s2 = "ros";

        int ans = editDistance(s1, s2);

        System.out.println("Edit Distance = " + ans);
    }
}
