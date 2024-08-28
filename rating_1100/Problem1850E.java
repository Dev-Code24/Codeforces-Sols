import java.util.*;

public class Problem1850E {
    static int n;
    static long c;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        c = sc.nextLong();
        var s = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            s.add(sc.nextInt());
        }
        
        Collections.sort(s);
        int l = 1;
        int r = (int) 1e9;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long sumall = 0;

            for (int i = 0; i < n; ++i) {
                long value = (long) (s.get(i) + 2 * mid);
                sumall += value * value;
                if (sumall > c)
                    break;
            }
            if (sumall == c) {
                System.out.println(mid);
                return;
            }

            if (sumall > c) {
                r = mid - 1;
            } else {
                l = mid + 1;
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

    // private static long gcd(long s, long b) {
    // while (b != 0) {
    // long temp = b;
    // b = s % b;
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