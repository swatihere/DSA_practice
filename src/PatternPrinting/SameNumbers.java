package PatternPrinting;

import java.util.Scanner;

public class SameNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //int col = sc.nextInt();

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }

    }
}
