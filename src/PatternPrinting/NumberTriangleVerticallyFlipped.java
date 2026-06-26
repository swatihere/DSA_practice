package PatternPrinting;

import java.util.Scanner;

public class NumberTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j <= n-i; j++ ){ //for opposite triangle (spaces)
                System.out.print("  ");
            }
            for(int j = 1 ; j <= i ; j++ ){ //for stars
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
