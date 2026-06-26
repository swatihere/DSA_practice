package Strings;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aaaabbbbbbccccdeeefffgggh";
        StringBuilder ans =  new StringBuilder();
        int count = 0 ;

        for(int i = 0 ; i < s.length()-1 ; i++ ){
            if (s.charAt(i) == s.charAt(i+1)){
                count++;
            }
            else{
                ans.append(s.charAt(i));
                ans.append(count);
                count = 1;
            }
        }
        ans.append(s.charAt(s.length()-1));
        ans.append(count);
        System.out.println(ans+" ");
    }
}
