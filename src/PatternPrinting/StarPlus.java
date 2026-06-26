package PatternPrinting;

import java.util.Scanner;

public class StarPlus {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //Enter the odd number
        int mid = n / 2  ;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == mid || j == mid) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        }
    }

