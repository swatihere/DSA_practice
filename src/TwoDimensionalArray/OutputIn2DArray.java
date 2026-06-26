package TwoDimensionalArray;

public class OutputIn2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][4]; //2D array is made of 3row and 4 column
        System.out.println(arr.length); //It tells the length of row
        System.out.println(arr[0].length); //it tells the length of columnn

        for(int i = 0 ; i <3 ; i ++){  //instead of 3 also write arr.length
            for(int j = 0 ; j <4 ; j++){  //instead of 4 also write arr[0].length
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //2nd method

        int[][] arr2 = {{1,2,3,4},{5,6,7,8,},{9,9,9,9},{8,8,8,8}};
        System.out.println(arr2.length);
        System.out.println(arr2[0].length);
        for(int i = 0 ; i <arr2.length ; i ++){
            for(int j = 0 ; j <arr2[i].length ; j ++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
