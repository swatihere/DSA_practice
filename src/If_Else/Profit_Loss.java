package If_Else;

import java.util.Scanner;

public class Profit_Loss {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter CP: ");
        int cp = sc.nextInt();
        System.out.println("Enter SP: ");
        int sp = sc.nextInt();

        if (sp > cp) {
            System.out.println("Profit is " +(sp - cp));
        }
        if (sp < cp) {
            System.out.println("Loss is" +(cp-sp));
        }
        if (sp == cp) {
            System.out.println("No Profit No Loss");
        }
    }
}
