import java.util.*;

public class Problem1876A {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        // pairs[i].first = number of residents, the resident i can share the message
        // pairs[i].second = cost for sharing one message from ith resident to some
        // other resident
        Pair v[] = new Pair[n];
        for (int i = 0; i < n; i++) {
            v[i] = new Pair();
            v[i].first = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            v[i].second = sc.nextInt();
        }

        Arrays.sort(v);

        long tmp = n - 1, cnt = 0, cost = k;

        long x = Math.min(tmp - cnt, v[0].first);
        cost += Math.min(x * k, x * v[0].second);
        cnt += x;

        for (int i = 1; i < n; i++) {
            if (cnt >= n - 1)
                break;
            x = Math.min(tmp - cnt, v[i].first);
            cost += Math.min(x * k, x * v[i].second);
            cnt += x;
        }

        System.out.println(cost);
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
        int first;
        int second;

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.second, o.second);
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }
}