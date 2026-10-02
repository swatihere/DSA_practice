package DynamicProgramming;
//Bitonic Subsequence is a subsequence that first increases and then decreases. It can also be only increasing or only decreasing.
public class LongestBitonicSubseq  {
    public static int longestBitonicSubseq(int[] arr) {
        int n = arr.length;
        int[] lis  = new int[n]; // Store increasing subsequence length ending at each index
        int[] lds = new int[n];   // Store decreasing subsequence length starting at each index

        for (int i = 0; i < n; i++) {
            lis[i] = 1;
            lds[i] = 1;
        }
        // Find Longest Increasing Subsequence (LIS)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 0; j++) {
                if (arr[i] > arr[j]) {   // Check if current element is greater
                    if (lis[j] + 1 > lis[i]) {  // Update increasing subsequence length
                        lis[i] = lis[j] + 1;
                    }
                }
            }
        }
        // Find Longest Decreasing Subsequence (LDS)
        for(int i = n-1; i >= 0; i--){
            for(int j = n-1; j >= 0; j--){
                if (arr[i] > arr[j]) {   // Check if current element is greater
                    if (lds[i] + 1 > lds[j]) {   // Update decreasing subsequence length
                        lds[i] = lds[j] + 1;
                    }
                }
            }
        }
        int max = 0;   // Find the maximum bitonic subsequence length
        for (int i = 0; i < n; i++) {
            int bitonic = lis[i] + lds[i] - 1;

            if (bitonic > max) {
                max = bitonic;
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 3, 2};

        int ans = longestBitonicSubseq(arr);

        System.out.println("Largest Bitonic Subsequence = " + ans);
    }
}

