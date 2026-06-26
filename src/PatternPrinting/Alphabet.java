package PatternPrinting;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1 ; i <= n ; i ++){
            for (int j = 1 ; j <= n ; j ++  ){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
