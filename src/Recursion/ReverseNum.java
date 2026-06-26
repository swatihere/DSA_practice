package Recursion;

public class ReverseNum {
    public static void main(String[] args) {
        int n = 123456789;
        reverse(n,0);
    }
    public static void reverse(int n,int r){
        if(n==0){
            System.out.println(r);
            return;
        }
        reverse(n/10,r*10+n%10);
    }
}
