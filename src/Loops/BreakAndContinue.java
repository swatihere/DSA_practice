package Loops;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean flag = true; //True means Prime

        for(int i = 2 ; i <= n - 1 ; i ++){   //COMPOSITE NUMBERS
            if (n % i == 0){
                flag = false; // False means Composite
                break;
            }
        }
        if(n==1){
            System.out.println("neuther prime nor composite");
        }
        else if (flag==false){
            System.out.println("composite number");
        }
        else{
            System.out.println("prime number");
        }
    }
}
