import java.util.*;

public class Problem598E {
    static final int inf = (int) 1e9, N = 33, K = 55;
    static int dp[][][];

    public static void solve() {
        dp = new int[N][N][K];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int l = 0; l < K; l++) {
                    if (l > (i * j)) {
                        dp[i][j][l] = inf;
                        continue;
                    }

                    if (l == (i * j) || l == 0) {
                        dp[i][j][l] = 0;
                        continue;
                    }

                    dp[i][j][l] = inf;

                    for (int i1 = 1; i1 < i; i1++)
                        for (int l1 = 0; l1 <= l; l1++) {
                            dp[i][j][l] = Math.min(dp[i][j][l], dp[i1][j][l1] + dp[i - i1][j][l - l1] + j * j);
                        }

                    for (int j1 = 1; j1 < j; j1++)
                        for (int l1 = 0; l1 <= l; l1++) {
                            dp[i][j][l] = Math.min(dp[i][j][l], dp[i][j1][l1] + dp[i][j - j1][l - l1] + i * i);
                        }
                }
            }
        }

    }

    public static void main(String[] args) {
        solve();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(dp[n][m][k]);

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