package Arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {7 , 56 , 78 , 34 ,89, 90, 34, 67};
        int max = arr[0];
        for ( int i = 0 ; i < arr.length ; i ++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
