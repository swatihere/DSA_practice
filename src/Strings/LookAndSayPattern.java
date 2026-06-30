package Strings;

public class LookAndSayPattern {
    public static String lookAndSay(int n) {
        if (n == 1) return "1";
        String s = lookAndSay(n-1);
        String ans = " ";
        int count = 1 ;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                count++;
            }
            else {
                ans += count;
                ans +=s.charAt(i-1);
                count = 1;
            }
        }
        ans += count;
        ans += s.charAt(s.length()-1);
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(lookAndSay(n));
    }
}
