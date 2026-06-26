package Strings;

public class CompareToStringMethod {
    public static void main(String[] args) {
        String a = "raghav";
        String b = "preet";
        System.out.println(a.compareTo(b));   // ascii value r ka jyda h p se or r baad mein aata h p k toh r baara hua

        String c = "harmeet";
        String d = "harsh";
        System.out.println(c.compareTo(d));//compare m and s, s baara h m se pr ctod compare horaha isliye minus6
        System.out.println(d.compareTo(c));

        String e = "harshita";
        String f = "harsh";
        System.out.println(e.compareTo(f));
        System.out.println(e.concat(f));
    }

}
