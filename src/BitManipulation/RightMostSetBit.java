package BitManipulation;

import java.util.Scanner;

public class RightMostSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n & -n;
        System.out.println(ans);
    }
}
