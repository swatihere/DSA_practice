package PatternPrinting;

import java.util.Scanner;

public class CrossPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //enter the number

        for (int i = 0 ; i < n ; i ++) {
            for (int j = 0 ; j < n ; j++) {
                if (i == j || i + j == n ) {
                    System.out.print("*");
                }
                else {
                    System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}
