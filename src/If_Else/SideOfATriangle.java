package If_Else;

import java.util.Scanner;

public class SideOfATriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the one side of the triangle");
        int a = sc.nextInt();
        System.out.println("Enter The Second Side Of Triangle");
        int b = sc.nextInt();
        System.out.println("Enter The Third Side Of The Triangle");
        int c = sc.nextInt();

        if (a+b>c && a+c>b && b+c>a)
            System.out.println("The triangle is a triangle");
        else System.out.println("The triangle is not a triangle");
    }
}
