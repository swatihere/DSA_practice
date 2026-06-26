package Loops;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //GP--> 1,2,4,8
        int a = 1 , r = 2;
        for(int i =1 ; i<=n ; i++){
            System.out.println(a);
            a *= r;
        }
    }
}
