import java.util.*;

public class Problem1999B {
    static int a1, a2, b1, b2;

    public static void solve(Scanner sc) {
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        b1 = sc.nextInt();
        b2 = sc.nextInt();

        int ans = 0;
        int[][] a = { { a1, a2 }, { a1, a2 }, { a2, a1 }, { a2, a1 } };
        int[][] b = { { b1, b2 }, { b2, b1 }, { b1, b2 }, { b2, b1 } };

        for (int i = 0; i < 4; i++) {
            int suneetRoundWins = 0;
            if (a[i][0] > b[i][0]) {
                suneetRoundWins++;
            }
            if (a[i][1] > b[i][1]) {
                suneetRoundWins++;
            }
            if (suneetRoundWins == 2) {
                ans++;
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