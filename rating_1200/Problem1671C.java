import java.util.*;

public class Problem1671C {
    static int n;
    static long x, a[], prefix[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        x = sc.nextLong();
        a = new long[n];
        prefix = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                prefix[i] = a[i];
            } else {
                prefix[i] = prefix[i - 1] + a[i];
            }
        }
        // Here instead of checking if the buyer can buy from first i shops on ith day,
        // it is being checked, for how many days the buyer can buy from the first ith shops
        long totalPacks = 0;
        for (int i = 0; i < n; i++) {
            long left = 0, right = (x - prefix[i]) / (i + 1);
            while (left <= right) {
                long mid = (left + right) / 2;
                if (prefix[i] + mid * i <= x) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            totalPacks += left;
        }

        System.out.println(totalPacks);

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