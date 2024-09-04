import java.util.*;

// good problem
public class Problem1832C {
    static int n;
    static long a[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        var list = new ArrayList<Long>();
        long last = -1;
        for (int i = 0; i < n; i++) {
            if (last == a[i])
                continue;
            list.add(a[i]);
            last = a[i];
        }

        n = list.size();
        int ans = n;
        for (int i = 0; i + 2 < n; ++i) {
            ans -= (list.get(i) < list.get(i + 1) && list.get(i + 1) < list.get(i + 2)) ? 1 : 0;
            ans -= (list.get(i) > list.get(i + 1) && list.get(i + 1) > list.get(i + 2)) ? 1 : 0;
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