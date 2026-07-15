package Stacks;

public class MaxRectangle {

    public int getMaxArea(char[][] mat) {

        int m = mat.length;     // Number of rows in the matrix
        int n = mat[0].length;   // Number of columns in the matrix

        // Histogram heights
        int[] height = new int[n];

        int max = 0;

        LargestRectangleInHistogram obj = new LargestRectangleInHistogram();

        // Traverse each row
        for (int i = 0; i < m; i++) {

            // Update histogram
            for (int j = 0; j < n; j++) {

                if (mat[i][j] == '1') {
                    height[j]++;
                }
                else {
                    height[j] = 0;
                }
            }

            // Find largest rectangle for current histogram
            int area = obj.largestRectangleArea(height);

            max = Math.max(max, area);
        }

        return max;
    }

    public static void main(String[] args) {

        char[][] mat = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };

        MaxRectangle obj = new MaxRectangle();

        System.out.println(obj.getMaxArea(mat));
    }
}
