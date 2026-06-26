package Recursion;

import java.util.Scanner;

public class PowerLinear {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base: ");
        int a = sc.nextInt();
        System.out.print("Enter the Exponent: ");
        int b = sc.nextInt();
        System.out.println(a+" raised to the power of "+b+ " is "+pow(a,b));
    }
    public static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        int call = pow(a,b-1);
        if (b%2==0) {
            return call*call;
        }
        else {
            return a*call*call;
        }

    }
}
