import java.util.*;

public class Problem1715B {
    static int n;
    static long k, b, s;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        k = sc.nextLong();
        b = sc.nextLong();
        s = sc.nextLong();

        List<Long> a = new ArrayList<>(n);
        s -= (k * b);
        a.add(k * b);
        if (s < 0) {
            System.out.println(-1);
            return;
        } else {
            for (int i = 0; i < n; i++) {
                long add = Math.min(k - 1, s);
                a.add(0l);
                a.set(i, add + a.get(i));
                s -= add;
            }
            if (s > 0) {
                System.out.println(-1);
                return;
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print(a.get(i) + " ");
                }
            }
        }
        System.out.println();
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