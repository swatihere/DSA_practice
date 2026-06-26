package If_Else;

import java.util.Scanner;

public class DivisbleBy5Or3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int n = sc.nextInt();

        if (n % 5 ==0 || n % 3 ==0)
            System.out.println("Divisible by 5 or 3");
        else
            System.out.println("Not Divisible by 5 or 3");
    }
}
