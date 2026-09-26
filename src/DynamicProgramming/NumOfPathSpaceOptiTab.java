package DynamicProgramming;

public class NumOfPathSpaceOptiTab {
    public static void main(String[] args) {
        int n = 4;

        int a = 0;    // For 0 steps, there is 1 way
        int b = 1;      // For 1 step, there is 1 way

        for(int i = 2; i <= n; i++){
            int c = a + b;  // Number of paths = previous two paths
            a = b;          // Move a to the previous value
            b = c;          // Move b to the current value
        }
        System.out.println(b);
    }
}
