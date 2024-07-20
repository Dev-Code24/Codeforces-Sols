import java.util.*;

/*
 * n = 4,   end = n - 1 = 11
 * k = 3,   j = end - k + 1 = 9
 * i = 0 j = 10,11
 *       end = 9
 *       j = end - k + 1 = 9
 * i = 1 j = 8,9
 * 2| 4 16 18 21 27 36 53 82 |91 92 95 --> length = 12
 * 0| 1 2  3  4  5  6  7  8  |9  10 11
 */
public class Problem1440B {
    public static void solve(Scanner sc) {

        int n = sc.nextInt();
        int k = sc.nextInt();

        int N = n * k;
        long[] a = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            a[i] = sc.nextLong();
        }
        long ans = 0;
        int i = (int) (N - n + Math.ceil(n / 2.0)); // (12 - 4 + 2) = 10
        while (k > 0) {
            ans += a[i];
            i = (int) (i - (n) + Math.ceil(n / 2.0) - 1); // (10 - 4 + 2) = 8
            k--;
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
