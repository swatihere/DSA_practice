package basics;

import java.util.Scanner;

public class TakingInput {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); // use when you have to put input

       System.out.println("Enter the radius of the circle");
       double r = sc.nextDouble();
       double a = 3.14 * r * r;
       System.out.println("The area of the circle is");
       System.out.println(a);
   }
}
