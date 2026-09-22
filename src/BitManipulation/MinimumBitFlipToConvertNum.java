package BitManipulation;

import java.util.Scanner;

public class MinimumBitFlipToConvertNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        int ans = start ^ end;  // XOR gives 1 where bits are different

        int count = 0 ;
        while(ans > 0){
            if(ans % 2 == 0){  // If last bit is 1, increase count
                count++;
            }
            ans = ans >> 1;  //move to the next bit
        }
        System.out.println("Minimum bit flips: " + count);
    }
}
