package Method;

import java.util.Scanner;

public class MaximumValueOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();

        System.out.println(Math.max(a,b));
    }
}
