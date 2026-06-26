package TwoDimensionalArray;

public class RowWithMaximunSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8,},{9,9,9,9},{8,8,8,8}};
        int maxSum = Integer.MIN_VALUE;
        int rowIndex = 0 ;

        for(int i=0;i<arr.length;i++){
            int sum = 0;  //Go row by row.
            for(int j=0;j<arr[i].length;j++){  //Go through all elements of that row.
                sum+=arr[i][j];  //Keep adding the elements to get the row sum.
            }
            if(sum>maxSum){
                maxSum=sum;
                rowIndex=i;
            }
        }
        System.out.println("Row = " + rowIndex);
        System.out.println("Maximum Sum = " + maxSum);

    }

}
