import java.util.*;

/*
 * If not understadnding the code or need some revision
 * Watch this vide0: https://youtu.be/LBTIqRU1e1Q?t=1349
 */

public class Problem1995B2 {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        long m = sc.nextLong();
        // pair[i][0] denotes number of petals of type i flower
        // pair[i][1] denotes the number/quantity of type i flowers
        Pair p[] = new Pair[n];

        for (int i = 0; i < n; i++) {
            if (p[i] == null) {
                p[i] = new Pair();
            }
            p[i].first = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            p[i].second = sc.nextInt();
        }

        Arrays.sort(p);

        long ans = 0;
        /*
         * Just checking if the girl can take only 1 type of flower petals
         */
        for (int i = 0; i < n; i++) {
            long amount = Math.min((m / p[i].first), p[i].second);
            ans = Math.max(ans, amount * p[i].first);
        }

        for (int i = 0; i < n - 1; i++) {
            if (p[i].first + 1 != p[i + 1].first)
                continue;

            // The current amount of coins the girl has
            long cur = m;
            // Finding out the amount of coins girl will have after purchasing p[i] type
            // petals
            long a = Math.min(cur / p[i].first, p[i].second); // max flowers girl can buy from type i
            cur -= a * p[i].first;

            long b = Math.min(cur / p[i + 1].first, p[i + 1].second);// with the remaining coins b is the max flowers
                                                                     // girl can buy from type i + 1
            cur -= b * p[i + 1].first;

            long x = Math.min(Math.min(a, p[i + 1].second - b), cur);
            cur -= x;

            ans = Math.max(ans, m - cur);
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

        @Override
        public int compareTo(Pair o) {
            return Long.compare(this.first, o.first);
        }
    }
}