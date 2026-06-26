package Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {7 , 8 , 9 , 3 , 12 , 14 , 16 , 20};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i ++){
            if(arr[i]>max)
                max = arr[i];
        }
        for(int i = 0 ; i < arr.length ; i ++){
            if(arr[i]>smax && arr[i] != max)
                smax = arr[i];
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
