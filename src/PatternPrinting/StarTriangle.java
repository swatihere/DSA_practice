package PatternPrinting;

import java.util.Scanner;

public class StarTriangle {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1 ; i <=n ; i++){  // i is row
            for(int j = 1 ; j<=i ; j++){  // j is column
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
