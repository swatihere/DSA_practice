package Strings;

public class Plus {
    public static void main(String[] args) {
        String s = "swati";
        s = s + "srivastava";
        System.out.println(s);

        String s1 = ("swati"+10+20);
        System.out.println(s1);

        String s2 = (10+"swati"+20);
        System.out.println(s2);

        String s3 = (10+20+"swati");
        System.out.println(s3);

        String s4 = ('A'+2+"swati");  //A=65
        System.out.println(s4);
    }
}
