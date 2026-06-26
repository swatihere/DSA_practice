package If_Else;

import java.util.Scanner;

public class Divisbleby5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int x =  sc.nextInt();

        if (x%5==0){
            System.out.println(" is a Divisible by 5");
        }
        else {
            System.out.println(" is not a Divisible by 5");

        }
    }
}
