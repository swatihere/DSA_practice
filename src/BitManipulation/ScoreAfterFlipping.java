package BitManipulation;

public class ScoreAfterFlipping{

    public static void main(String[] args) {

        int[][] matrix = {
                {0, 0, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 0}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Step 1: Make the first element of every row 1
        for (int i = 0; i < rows; i++) {

            // If first element is 0, flip the complete row
            if (matrix[i][0] == 0) {

                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = 1 - matrix[i][j];
                }
            }
        }

        // Step 2: Check every column
        for (int j = 1; j < cols; j++) {

            int ones = 0;

            // Count number of 1s in the column
            for (int i = 0; i < rows; i++) {

                if (matrix[i][j] == 1) {
                    ones++;
                }
            }

            // Number of zeros
            int zeros = rows - ones;

            // If zeros are more, flip the column
            if (zeros > ones) {

                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 1 - matrix[i][j];
                }
            }
        }

        // Step 3: Calculate the score
        int score = 0;

        for (int i = 0; i < rows; i++) {

            int number = 0;

            for (int j = 0; j < cols; j++) {

                // Convert binary number into decimal
                number = number * 2 + matrix[i][j];
            }

            // Add row value to score
            score = score + number;
        }

        System.out.println("Score = " + score);
    }
}
