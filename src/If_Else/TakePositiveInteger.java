package If_Else;

import java.util.Scanner;

public class TakePositiveInteger {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num % 5 == 0 && num % 3 == 0)
            System.out.println("The Number is Divible by 5 and 3");
        else if (num % 3 == 0) {
            System.out.println("The Number is Divisible by 3");
        }
        else if (num % 5 == 0) {
            System.out.println("The Number is Divisible by 5");
        }
        else
            System.out.println("Not Divisible by 5 or 3");

    }
}
