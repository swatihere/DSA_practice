package Strings;

public class InterningNew {
    public static void main(String[] args) {
        String s1 = ("swati");
        String s2 = new String("swati");
        String s3 = "swati";
        System.out.println(s1 == s2);  //false because location is diff
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2)); // now it will compare char by char
    }
}
