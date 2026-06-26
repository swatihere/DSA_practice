package Strings;

public class PassingStringToMethod {
    public static void change(String s){
        s="kavya";
    }
    public static void main(String[] args) {   //immutable
        String s = "swati";
        System.out.println(s);
        change(s);
        System.out.println(s);
    }
}
