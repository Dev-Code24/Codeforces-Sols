import java.util.*;

/*
 * If not understood then can read the editorial of this problem: https://codeforces.com/blog/entry/123530
 */
public class Problem1914C {
    static int n, k;
    static int a[];
    static int b[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        k = sc.nextInt();
        a = new int[n];
        b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
           b[i] = sc.nextInt();
        }

        long sum = 0, res = 0, max = Long.MIN_VALUE;
        for (int i = 0; i < Math.min(n, k); i++) {
            sum += a[i];
            max = Math.max(max, b[i]);
            res = Math.max(res, sum + max * (k - i - 1));
        }

        System.out.println(res);
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