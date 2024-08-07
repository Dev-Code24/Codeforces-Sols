import java.util.*;

public class Problem1715B {
    static int n;
    static long k, b, s;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        k = sc.nextLong();
        b = sc.nextLong();
        s = sc.nextLong();

        List<Long> a = new ArrayList<>();
        a.add((long) (k * b));
        s -= k * b;
        if (s < 0)
            System.out.println(-1);
        else {
            for (int i = 0; i < n; ++i) {
                long now = Math.min(k - 1, s);
                a.set(i, a.get(i) + now);
                s -= now;
            }
            if (s > 0)
                System.out.println(-1);
            else {
                for (int i = 0; i < n; ++i)
                    System.out.print(a.get(i) + " ");
                System.out.println();
            }
        }
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