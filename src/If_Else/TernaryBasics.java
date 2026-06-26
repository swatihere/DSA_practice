package If_Else;

import java.util.Scanner;

public class TernaryBasics {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        //condition ? "sach" : "jhooth"
        System.out.println((n%2==0) ? "Even" : "Odd");
    }
}
