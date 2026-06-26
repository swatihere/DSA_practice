package Strings;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = "";  //Empty String
        s += n;
        System.out.println(s);

        //2nd method
        //String s = Integer.toString(n);
        //System.out.println(s);
    }
}
