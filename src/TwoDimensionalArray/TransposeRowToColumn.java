package TwoDimensionalArray;

public class TransposeRowToColumn {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, 1, 2}
        };
        int row = arr.length;
        int col = arr[0].length;
        int[][] trans = new int[col][row];
        for(int i = 0 ; i < row; i++){
            for(int j = 0 ; j < col; j++){
                trans[j][i] = arr[i][j];
            }
        }
        for(int i = 0; i < trans.length; i++){
            for(int j = 0; j < trans[i].length; j++){
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }

}
