package CyclicSort;

public class MissingArray {
    public static int missingNumbers(int[] arr){
        int n =  arr.length; //0 to n given
        int i = 0 ;
        while(i<arr.length){
            int correct = arr[i];
            if (arr[i] < n && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }

        }
        for (i = 0; i < n; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return n;
    }
    public static void swap(int[] arr,int i,int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};

        System.out.println(missingNumbers(arr));
    }

}
