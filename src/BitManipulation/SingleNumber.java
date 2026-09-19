package BitManipulation;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};

        int ans = 0 ;  //start answer with the zero

        for(int i = 0 ; i < arr.length ; i++){  //traverse the array
            ans = ans ^ arr[i];  //XOR each element
        }
        System.out.println(ans);
    }
}
