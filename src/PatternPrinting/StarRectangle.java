package PatternPrinting;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i = 1 ; i <= row ; i ++){ //KITNI LINES HOGI
            for(int j = 1 ; j <= col ; j++){//HAR LINE MEIN KITNA PRINT HOGA
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
