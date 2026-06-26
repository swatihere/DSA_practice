package Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = { 2 , 3 ,4 , 5, 6 , 7, 8 ,9};
        int n = arr.length + 1 ; //array mein 1 to n num hai jisme ek missing hai toh plus 1

        int sum = n * (n + 1) / 2;
        int arraysum = 0 ;

        for (int i = 0 ; i < arr.length ; i++){
            arraysum += arr[i];

        }

        int missing = sum - arraysum ;
        System.out.println(missing);
    }
}
