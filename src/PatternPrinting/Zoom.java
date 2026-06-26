package PatternPrinting;

import java.util.Scanner;

public class Zoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1 ; i <= 2*n- 1; i ++){ //KITNI LINES HOGI
            for(int j = 1 ; j <= 2*n - 1; j++){//HAR LINE MEIN KITNA PRINT HOGA

                int a = i , b = j ;
                if(i>n) a = 2*n -i;
                if(j>n) b = 2*n - j;

                System.out.print(Math.min(a,b)+" ");
            }
            System.out.println();
        }
    }
}
