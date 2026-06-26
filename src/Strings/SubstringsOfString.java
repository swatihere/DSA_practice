package Strings;

public class SubstringsOfString {
    public static void main(String[] args) {
        String s = "Swatisrivastava";
        System.out.println(s.substring(0));
        System.out.println(s.substring(5));
        System.out.println(s.substring(0,5));
        System.out.println(s.substring(0,s.length()));
        System.out.println(s.substring(0,s.length()-1));
    }
}
