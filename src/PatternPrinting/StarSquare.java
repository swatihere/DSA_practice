package PatternPrinting;

import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();

        for(int i = 1 ; i <= row ; i ++){ //KITNI LINES HOGI
            for(int j = 1 ; j <= row ; j++){//HAR LINE MEIN KITNA PRINT HOGA
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
