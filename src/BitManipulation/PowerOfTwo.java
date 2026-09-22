package BitManipulation;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n > 0 && (n & (n-1)) == 0){
            System.out.println("Power Of Two");
        }
        else{
            System.out.println("Not Power Of Two");
        }
    }
}
