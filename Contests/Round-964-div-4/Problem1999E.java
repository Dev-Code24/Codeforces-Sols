import java.util.*;

public class Problem1999E {
    static int l, r;

    public static void solve(Scanner sc) {
        l = sc.nextInt();
        r = sc.nextInt();
        int n = r - l + 1;
        long a[] = new long[n];
        long dp[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = l + i;
        }
        // 1 2 3
        long count = 0;
        while (a[0] > 0) {
            a[0] = a[0] / 3;
            a[1] = a[1] * 3;
            count++;
        }
        dp[0] = count;
        a[1] = a[1] / (long) Math.pow(3, count);
        count += count;
       

        for (int i = 1; i < n; i++) {
            while (a[i] > 0) {
                a[i] = a[i] / 3;
                count++;
            }
        }
        System.out.println(count);
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