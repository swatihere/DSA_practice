package BitManipulation;

import java.util.Scanner;

public class TurnOnKthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        n = n | (1 << k);  // or with left shift

        System.out.println(n);
    }
}
