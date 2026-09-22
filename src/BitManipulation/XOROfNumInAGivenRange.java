package BitManipulation;

import java.util.Scanner;

public class XOROfNumInAGivenRange {
    public static int xorFromOne(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 4 == 0) {
            return n;
        }
        else if (n % 4 == 1) {
            return 1;
        }
        else if (n % 4 == 2) {
            return n+1;
        }
        else{
            return 0 ;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l =  sc.nextInt();
        int r = sc.nextInt();

        int ans =  xorFromOne(r) ^ xorFromOne(l - 1);

        System.out.println(ans);
    }
}
