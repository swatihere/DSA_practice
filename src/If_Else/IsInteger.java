package If_Else;

import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        double n = sc.nextDouble();
        int x = (int)n; //Type Casting

        if(n-x == 0)
        System.out.println("The number is integer");

        else
            System.out.println("The number is not integer");
    }
}
