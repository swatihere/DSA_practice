package Loops;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int n = sc.nextInt();
        int count = 0 ;

        while(n!=0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}
