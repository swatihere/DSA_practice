package Loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        // ap 2, 5, 8, 11, 14 formula of ap--> a+(n-1)d
        for(int i = 2 ; i <= (3*n+1) ; i+=3){
            System.out.println(i);
        }

        //2nd method
        int a = 2 , d = 3;
        for (int i = 1; i <= n; i++){
            System.out.println(a);
            a = a + d;
        }
    }
}
