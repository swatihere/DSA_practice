package Strings;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "madam";
        int lo = 0;
        int hi = s.length() - 1;
        boolean ispalindrome= true;

        while(lo<hi){
            if(s.charAt(lo)!=s.charAt(hi)){
                ispalindrome = false;
                break;
            }
            lo++;
            hi--;
        }
        if(ispalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
