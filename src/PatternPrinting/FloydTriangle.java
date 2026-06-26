package PatternPrinting;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 1;

        for(int i = 1 ; i <= n ; i ++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
