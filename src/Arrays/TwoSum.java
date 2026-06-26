package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;

        for (int i = 0; i < arr.length; i++) {  //for every element
            for (int j = i + 1; j < arr.length; j++) {   // ek loop chlega
                if (arr[i] + arr[j] == target) {
                    System.out.println("values " + arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
