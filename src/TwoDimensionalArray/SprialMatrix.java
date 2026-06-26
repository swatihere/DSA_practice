package TwoDimensionalArray;

import java.util.ArrayList;

public class SprialMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int m = arr.length;
        int n = arr[0].length;
        int firstrow = 0;
        int lastrow = m - 1;
        int firstcol = 0;
        int lastcol = n - 1;

        while (firstrow <= lastrow && firstcol <= lastcol) {
            //right
            for (int j = firstcol; j <= lastcol; j++) {
                System.out.print(arr[firstrow][j]+" ");
            }
                firstrow++;
                if(firstrow>lastrow || firstcol>lastcol){
                    break;
                }
            //down
            for(int i  = firstrow; i <= lastrow; i++) {
                System.out.print(arr[i][lastcol]+" ");
            }
                lastcol--;
                if(firstrow>lastrow || firstcol>lastcol){
                    break;
                }
            //left
            for(int j = lastcol; j >= firstcol; j--){
                System.out.print(arr[lastrow][j]+" ");
            }
                lastrow--;
                if(firstrow>lastrow || firstcol>lastcol){
                    break;
                }

            for(int i  = lastrow; i >= firstrow; i--){
                System.out.print(arr[i][firstcol]+" ");
            }
            firstcol++;
            if(firstrow>lastrow || firstcol>lastcol){
                break;
            }
        }

    }


}
