import java.util.*;

public class Problem1995B1 {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        long m = sc.nextLong();

        long[] petalCosts = new long[n];
        for (int i = 0; i < n; i++) {
            petalCosts[i] = sc.nextLong();
        }
        long ans = Integer.MIN_VALUE;
        Arrays.sort(petalCosts);

        for (int i = 0; i < n;) {
            int j = i;
            while (j < n && petalCosts[j] == petalCosts[i])
                j++;

            int l = j;
            while (l < n && petalCosts[l] == petalCosts[i] + 1)
                l++;

            for (int c = 0; c <= j - i; c++) {
                if (c * petalCosts[i] > m)
                    continue;

                long val = c * petalCosts[i];
                /*
                 * The following line means that t is equal to the minimum of number of
                 * petals that is available in the petalsCosts array i.e. l - j, and
                 * petals that the girl can actually take, because she has a limit of m
                 */
                long t = Math.min((m - val) / (petalCosts[i] + 1), l - j);

                val += t * (petalCosts[i] + 1);

                ans = Math.max(ans, val);
            }
            i = j;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }
    /*
     * private static long gcd(long a, long b) {
     * while (b != 0) {
     * long temp = b;
     * b = a % b;
     * a = temp;
     * }
     * return a;
     * }
     * private static long lcm(long a, long b) {
     * return a * b / gcd(a, b);
     * }
     */
}