package Arrays;

public class LinearSearchIndexing {
   public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5};
       int target = 3;
       int index = -1;
       boolean flag = false;  //false means target array mein ni hai
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == target) {
               index = i;
               break;
           }
       }
       if (index != -1) {
           System.out.println("element found at index " + index);
       } else System.out.println("Element not found");
   }
}
