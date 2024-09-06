import java.util.*;

public class Problem1692E {
    static int n, s;
    static int a[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        s = sc.nextInt();
        a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        if (sum < s) {
            System.out.println(-1);
            return;
        }
        int l = 0, r = 0;
        sum = 0;
        int ans = 0;
        while (r < n && l < n) {
            while (r < n && sum + a[r] <= s) {
                sum += a[r];
                r++;
            }
            ans = Math.max(ans, r - l);
            sum -= a[l];
            l++;
        }
        System.out.println(n - ans);
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