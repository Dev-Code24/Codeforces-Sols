import java.util.*;

// perfect explanation: https://youtu.be/i1i_7lqnGwA?t=143
public class Problem1808B {
    static int n, m;
    static int c[][];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        m = sc.nextInt();

        c = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[j][i] = sc.nextInt();
            }
        }

        long ans = 0;
        for (int j = 0; j < m; j++) {
            Arrays.sort(c[j]);
            for (int i = 0; i + 1 < n; i++) {
                ans += (long) (c[j][i + 1] - c[j][i]) * (i + 1) * (n - i - 1);
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