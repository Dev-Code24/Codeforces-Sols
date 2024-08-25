import java.util.*;

public class Problem1117B {
    static int n, m, k;
    static long a[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        long max1 = a[n - 1];
        long max2 = a[n - 2];

        long ans = m > k ? ((m - (m / (k + 1))) * max1 + (m / (k + 1)) * max2) : m * max1;
        System.out.println(ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
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