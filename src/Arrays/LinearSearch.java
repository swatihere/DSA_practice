package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 3;
        boolean flag = false;  //false means target array mein ni hai
        for(int i =0 ; i < arr.length ; i++) {
            if (arr[i] == target) {
                flag = true;
                break;
            }
        }
            if (flag == true){
                System.out.println("element found");
            }
            else System.out.println("Element not found");
    }
}
