import java.util.*;

public class Problem2007B {
    static int n, m;
    static long a[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        m = sc.nextInt();
        a = new long[n];
        long max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
        }

        for (int i = 0; i < m; i++) {
            boolean bool = sc.next().equals("+");
            int l = sc.nextInt();
            int r = sc.nextInt();
            if (max >= l && max <= r) {
                max += bool ? +1 : -1;
            }

            System.out.print(max + " ");

        }
        System.out.println();
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