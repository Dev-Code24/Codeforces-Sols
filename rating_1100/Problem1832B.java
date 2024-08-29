import java.util.*;

public class Problem1832B {
    static int n, k;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        k = sc.nextInt();
        var a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int el = sc.nextInt();
            a.add(el);
        }

        Collections.sort(a);
        var prefix = new ArrayList<Long>(n + 1);
        prefix.add(0l);
        long ans = 0l;
        for (int i = 1; i <= n; i++) {
            prefix.add(prefix.get(i - 1) + a.get(i - 1));
        }

        for (int i = 0; i <= k; i++) {
            ans = Math.max(ans, prefix.get(n - (k - i)) - prefix.get(2 * i));
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