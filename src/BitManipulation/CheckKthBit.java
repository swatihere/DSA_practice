package BitManipulation;

import java.util.Scanner;

public class CheckKthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        System.out.println("Enter k :");
        int k = sc.nextInt();

        if((n>>k)% 2 == 1){
            System.out.println("Kth bit is Set");
        }
        else{
            System.out.println("Kth bit is Not Set");
        }
    }
}
