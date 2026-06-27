package Recursion;

public class ReachTheNthStair {
    public static int stairs(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return stairs(n-1)+stairs(n-2);
    }
    public static void main (String[] args){
        int n = 5;
        System.out.println(stairs(n));
    }
}
