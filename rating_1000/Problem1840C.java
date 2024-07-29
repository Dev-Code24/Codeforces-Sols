import java.util.*;

public class Problem1840C {
    static int n, k, q;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        k = sc.nextInt(); // vacation min days = k
        q = sc.nextInt(); // temp does not rise above q i.e ai <= q always

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int len = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] <= q) {
                len++;
            } else {
                if (len >= k)
                    ans += (len - k + 1) * (len - k + 2) / 2;
                len = 0;
            }
        }
        if (len >= k)
            ans += (len - k + 1) * (len - k + 2) / 2;

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