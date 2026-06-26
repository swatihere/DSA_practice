package Recursion;

public class FunctionCallItself {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        if(n==0){ //Base case
        return;
        }
            System.out.println(n); //work
            print(n-1); //Call
    }
}
//This is Standard Recursive Code