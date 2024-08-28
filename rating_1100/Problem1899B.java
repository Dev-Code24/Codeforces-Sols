import java.util.*;

public class Problem1899B {
    static int n;
    static long a[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextLong();
        }
        long ans = -1;

        for (int d = 1; d <= n; d++) {
            if (n % d == 0) {
                long mx = Long.MIN_VALUE;
                long mn = Long.MAX_VALUE;

                for (int i = 1; i <= n; i += d) {
                    long sm = 0;
                    for (int j = i; j < i + d; j++) {
                        sm += a[j];
                    }
                    mx = Math.max(mx, sm);
                    mn = Math.min(mn, sm);
                }
                ans = Math.max(ans, mx - mn);
            }
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

    // private static long gcd(long a, long b) {
    // while (b != 0) {
    // long temp = b;
    // b = a % b;
    // a = temp;
    // }
    // return a;
    // }

    // private static long lcm(long a, long b) {
    // return a * b / gcd(a, b);
    // }

    // static class Pair implements Comparable<Pair> {
    // long first;
    // long second;
    //
    // Pair(long _first, long _second) {
    // this.first = _first;
    // this.second = _second;
    // }
    // @Override
    // public int compareTo(Pair o) {
    // return Long.compare(this.first, o.first);
    // }
    // @Override
    // public String toString() {
    // return "(" + first + ',' + second + ")";
    // }
    // }
}