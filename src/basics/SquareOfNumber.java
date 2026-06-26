package basics;

import java.util.Scanner;

public class SquareOfNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int x = sc.nextInt();
        int s = x * x ;

        System.out.println("the square of the Number:");
        System.out.println(s);

    }
}
