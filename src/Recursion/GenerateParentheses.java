package Recursion;

public class GenerateParentheses {
    public static void main(String[] args){
        int n = 3;
        generate("", 0 , 0 ,n);
    }
    public static void generate(String s, int left, int right, int n){
        if(s.length() == 2*n){
            System.out.println(s);
            return;
        }
        if(left<n){
            generate(s +"(", left+1, right, n);
        }
        if(right<left){
            generate(s+")", left, right+1, n);

        }
    }
}
