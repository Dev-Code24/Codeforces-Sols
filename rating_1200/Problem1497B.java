import java.util.*;

public class Problem1497B {
    static int n, m;
    static int cnt[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            cnt = new int[m];

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int mod = x % m;
                cnt[mod]++;
            }
            int ans = 0;

            for (int x = 0; x <= m / 2; x++) {
                int y = (m - x) % m;
                if (x == y) {
                    ans += cnt[x] > 0 ? 1 : 0;
                    continue;
                }
                if (cnt[x] + cnt[y] > 0) {
                    ans += Math.max(Math.abs(cnt[x] - cnt[y]), 1);
                }
            }
            System.out.println(ans);

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
    // @Override
    // public boolean equals(Object o) {
    // if (this == o)
    // return true;
    // if (o == null || getClass() != o.getClass())
    // return false;
    // Pair pair = (Pair) o;
    // return first == pair.first && second == pair.second;
    // }
    // @Override
    // public int hashCode() {
    // return Objects.hash(first, second);
    // }
    // }
}