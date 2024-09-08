import java.util.*;

public class Problem1539C {
    static int n;;
    static long k, x, a[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        k = sc.nextLong();
        x = sc.nextLong();

        a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Arrays.sort(a);

        List<Long> gaps = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            long diff = a[i] - a[i - 1];
            if (diff > x) {
                gaps.add((diff - 1) / x);
            }
        }
        Collections.sort(gaps);

        int groups = gaps.size() + 1;

        for (long needed : gaps) {
            if (k >= needed) {
                k -= needed;
                groups--;
            } else {
                break;
            }
        }

        System.out.println(groups);
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