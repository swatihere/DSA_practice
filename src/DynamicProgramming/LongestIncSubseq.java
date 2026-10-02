package DynamicProgramming;

public class LongestIncSubseq {
    public static int lis(int[] arr){
        int n = arr.length;

        int[] dp = new int[n];
        for(int i = 0; i < n; i++){   // Initially, every element itself is an LIS of length 1
            dp[i] = 1;
        }
        for(int i = 1; i < n; i++){  // Check each element
            for(int j = 0; j < i; j++){// Check all previous elements
                if(arr[i] > arr[j]){
                    if(dp[j] + 1 > dp[i] ){
                        dp[i] = dp[j] + 1;
                    }
                }
            }
        }
        int max = dp[0];  // Find the maximum value in dp
        for(int i = 0; i < n; i++){
            if(dp[i] > max){
                max = dp[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};

        int ans = lis(arr);

        System.out.println("Length of LIS = " + ans);
    }
}
