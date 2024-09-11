import java.util.*;

public class Problem1931D {
    static int n, x, y, a[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long ans = 0;
        var map = new HashMap<Pair, Integer>();

        // let ai%x = a and aj%x = b
        // then and we want (ai + aj) % x to be equal to 0,
        // also we want (ai - aj)% y = 0
        // => (a - b) % y = 0

        for (var el : a) {
            int ajx1 = (x - (el % x)) % x;
            // int ajx2 = -(el % x);
            // int ajy1 = ((el % y) - y) % y;
            int ajy2 = el % y;

            // Pair p1 = new Pair(ajx1, ajy1);
            Pair p2 = new Pair(ajx1, ajy2);
            // Pair p3 = new Pair(ajx2, ajy1);
            // Pair p4 = new Pair(ajx2, ajy2);

            // ans += map.getOrDefault(p1, 0);
            ans += map.getOrDefault(p2, 0);
            // ans += map.getOrDefault(p3, 0);
            // ans += map.getOrDefault(p4, 0);

            Pair p = new Pair(el % x, el % y);
            map.put(p, map.getOrDefault(p, 0) + 1);
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

    static class Pair implements Comparable<Pair> {
        long first;
        long second;

        Pair(long _first, long _second) {
            this.first = _first;
            this.second = _second;
        }

        @Override
        public int compareTo(Pair o) {
            return Long.compare(this.first, o.first);
        }

        @Override
        public String toString() {
            return "(" + first + ',' + second + ")";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Pair pair = (Pair) o;
            return first == pair.first && second == pair.second;
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }
}