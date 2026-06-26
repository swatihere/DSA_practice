package Recursion;

public class GCDOrHCF {

        public static int hcf(int a, int b) {

            if (b == 0) {
                return a;
            }

            return hcf(b, a % b);
        }

        public static void main(String[] args) {

            int a = 24;
            int b = 26;

            System.out.println(hcf(a, b));
        }

}
