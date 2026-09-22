package BitManipulation;

public class Subsets {
    public static void main(String[] args) {
        int [] arr = { 1 , 2, 3,};

        int n = arr.length;
        int total = 1 << n ; //bit manipulation way of calculating 2^n

        for(int i = 0; i < total; i++){    // Run loop for every possible subset
            for(int j = 0; j < total; j++){  // Check every element of the array

                if((i >> j) % 2 == 1){
                    System.out.print(arr[j]+" ");
                }
            }
            System.out.println();
        }
    }
}
