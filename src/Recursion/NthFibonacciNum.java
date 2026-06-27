package Recursion;

public class NthFibonacciNum {
   public static int fib(int n){
       if(n==0 || n==1){
           return n;
       }
       return fib(n-1) + fib(n-2); //two time call
   }
   public static  void main(String[] args) {
       int n = 6;
       System.out.println(fib(n));

   }
}
