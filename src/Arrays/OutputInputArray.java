package Arrays;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr= {4,5,6,7,8,9};
        for(int i = 0 ; i <= 5 ; i++){  //or i<6 or i < arr.length
           System.out.print(arr[i]+" ");
        }

        int[] num = new int[7];
        //for(int i = 0 ; i <= 6 ; i++){
          //  System.out.print(num[i]+" ");  //by default values are zero
        //}

        //input
        for(int i = 0 ; i <= 6 ; i++){
            num[i] = sc.nextInt();
        }

        //print
        for(int i = 0 ; i <= 6 ; i++){
            System.out.print(num[i]+" ");
        }

        //double
        for(int i = 0 ; i <= 6 ; i++){
            System.out.print(2*num[i]+" ");
        }
    }
}
