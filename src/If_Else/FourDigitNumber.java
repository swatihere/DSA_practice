package If_Else;

import java.util.Scanner;

public class FourDigitNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        if(n >999 && n <10000)
            System.out.println("the number is 4 digit number");
        else
            System.out.println("The number is not a four digit number");
    }
}
