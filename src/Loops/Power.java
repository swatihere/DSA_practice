package Loops;

import java.util.Scanner;

public class Power {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the number");
        int b = sc.nextInt();

        int pow = 1;

        for (int i = 1 ; i <= b ; i ++){
            pow *= a;
        }
            System.out.println(pow);
    }
}
