package DynamicProgramming;

public class FibonacciWithSpaceOptiTab {
    public static void main(String[] args) {
        int n = 5;
        int a = 0;    // First Fibonacci number
        int b = 1;    // Second Fibonacci number

        for(int i = 2; i <= n; i++){   // Start from the 2nd index
            int c = a + b;  // Calculate the next Fibonacci number
            a=b;    // Move a to the previous value
            b=c;     // Move b to the current value
        }
        System.out.println(b);
    }
}
