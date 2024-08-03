import java.util.*;

public class Problem1831B {
    static int n;
    static int a[], b[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new int[n];
        b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int[] fa = new int[2 * n + 1];
        int[] fb = new int[2 * n + 1];

        int p = 0;
        for (int i = 1; i < n; ++i) {
            if (a[i] != a[i - 1]) {
                fa[a[i - 1]] = Math.max(fa[a[i - 1]], i - p);
                p = i;
            }
        }
        fa[a[n - 1]] = Math.max(fa[a[n - 1]], n - p);

        p = 0;
        for (int i = 1; i < n; ++i) {
            if (b[i] != b[i - 1]) {
                fb[b[i - 1]] = Math.max(fb[b[i - 1]], i - p);
                p = i;
            }
        }
        fb[b[n - 1]] = Math.max(fb[b[n - 1]], n - p);

        int ans = 0;
        for (int i = 0; i <= n + n; ++i) {
            ans = Math.max(ans, fa[i] + fb[i]);
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