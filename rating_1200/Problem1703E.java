import java.util.*;

public class Problem1703E {
    static int n;
    static char a[][];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new char[n][n];

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            a[i] = s.toCharArray();
        }

        int ans = 0;
        int vis[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (vis[i][j] == 1)
                    continue;

                int r1 = i + 1;
                int c1 = j + 1;
                int r2 = c1;
                int c2 = n + 1 - r1;
                int r3 = c2;
                int c3 = n + 1 - r2;
                int r4 = c3;
                int c4 = n + 1 - r3;

                int sum = a[r1 - 1][c1 - 1] - '0';
                sum += a[r2 - 1][c2 - 1] - '0';
                sum += a[r3 - 1][c3 - 1] - '0';
                sum += a[r4 - 1][c4 - 1] - '0';

                vis[r1 - 1][c1 - 1] = 1;
                vis[r2 - 1][c2 - 1] = 1;
                vis[r3 - 1][c3 - 1] = 1;
                vis[r4 - 1][c4 - 1] = 1;

                ans += Math.min(sum, 4 - sum);
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