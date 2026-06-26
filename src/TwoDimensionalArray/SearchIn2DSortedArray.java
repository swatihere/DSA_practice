package TwoDimensionalArray;

public class SearchIn2DSortedArray {
    public static void main(String[] args) {
        int[][] arr= {{1,4,7,11},{2,5,8,12},{3,6,9,13},{14,15,16,17}};
        int i = 0 ;
        int target=16;
        int j = arr[0].length-1;
        while(i<arr.length && j>=0){
            if(arr[i][j]==target){
                System.out.println("found");
                break;
            }
            else if(arr[i][j]>target){
                j--;
            }
            else{
                i++;
            }

        }
    }
}
