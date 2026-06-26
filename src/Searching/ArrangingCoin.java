package Searching;

public class ArrangingCoin {
    public static void main(String[] args) {

        int n = 8;

        int lo = 0;
        int hi = n;
        int ans = 0;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            long coins = (long) mid * (mid + 1) / 2;

            if (coins <= n) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        System.out.println(ans);
    }
}
