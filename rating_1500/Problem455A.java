import java.util.*;

public class Problem455A {
    static int n;
    static int a[];

    public static void solution(Scanner sc) {
        n = sc.nextInt();
        a = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
        }

        long cnt[] = new long[max + 1];
        for (int i = 0; i < n; i++) {
            cnt[a[i]]++;
        }
        long[] dp = new long[max + 1];
        dp[1] = cnt[1];

        for (int i = 2; i <= max; i++) {
            dp[i] = Math.max(dp[i - 1], (cnt[i] * i) + dp[i - 2]);
        }

        System.out.println(dp[max]);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc);
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