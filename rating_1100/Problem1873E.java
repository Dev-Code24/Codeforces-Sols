import java.util.*;

// applied lower bound using binary search
public class Problem1873E {
    static int n, x;
    static long a[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        x = sc.nextInt();
        a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long lo = 0, hi = 2000000001L;
        while (lo < hi) {
            long mid = lo + (hi - lo + 1) / 2;
            long tot = 0;
            for (int i = 0; i < n; i++) {
                tot += Math.max(mid - a[i], 0L);
            }
            if (tot <= x) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }

        System.out.println(lo);

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