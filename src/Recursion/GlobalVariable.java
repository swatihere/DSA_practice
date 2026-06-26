package Recursion;

public class GlobalVariable {
    static int x = 10; //to declare global variable

    public static void main(String[] args) {
        fun();
        x=9; //change
        System.out.println(x);
        int x = 4;  //local variable more imp than global
        System.out.println(x);
        x=6;

    }
    public static void fun(){
        x=20;
        System.out.println(x);
    }
}
