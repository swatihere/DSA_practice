package TwoDimensionalArray;

public class PascalTriangleReturnParticularRow {
    public static void main(String[] args) {

        int row = 3;

        int num = 1;

        for (int j = 0; j <= row; j++) {

            System.out.print(num + " ");

            num = num * (row - j) / (j + 1);
        }
    }
}
