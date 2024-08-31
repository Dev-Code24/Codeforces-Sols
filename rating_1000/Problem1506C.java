import java.util.*;

public class Problem1506C {
    static String a, b;

    public static void solve(Scanner sc) {
        a = sc.next();
        b = sc.next();
        int alen = a.length();
        int blen = b.length();

        int dp[][] = new int[alen + 1][blen + 1];
        int max = 0;

        for (int i = 1; i <= alen; i++) {
            for (int j = 1; j <= blen; j++) {
                char ca = a.charAt(i - 1);
                char cb = b.charAt(j - 1);
                if (ca == cb) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 0;
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        System.out.println(alen + blen - (2 * max));

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