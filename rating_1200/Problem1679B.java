import java.util.*;

public class Problem1679B {
    static int n, q;
    static int a[];
    // static long prefix[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        q = sc.nextInt();
        a = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        long lastT2 = -1;
        var hm = new HashMap<Integer, Long>();
        while (q-- > 0) {
            int t = sc.nextInt();
            if (t == 1) {
                int i = sc.nextInt() - 1;
                long x = sc.nextLong();
                if (lastT2 == -1) {
                    if (!hm.containsKey(i)) {
                        hm.put(i, x);
                        sum = sum - a[i] + x;
                    } else {
                        sum = sum - hm.get(i) + x;
                    }
                } else {
                    if (!hm.containsKey(i)) {
                        hm.put(i, x);
                        sum = sum - lastT2 + x;
                    } else {
                        sum = sum - hm.get(i) + x;
                    }
                }
            } else {
                long x = sc.nextLong();
                sum = n * x;
                lastT2 = x;
                hm = new HashMap<>();
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        solve(sc);
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