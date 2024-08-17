import java.util.*;

/*
 * Convert all the elements in the given array to a[i] = a[i] % 2
 * Then just find contiguous pairs with same value, either 1 1 or 0 0
 * and just count the number of pairs in array
 */
public class Problem1777A {
    static int n;
    static int a[];
    static int ops;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (sc.nextInt() % 2);
        }

        ops = 0;
        for (int i = 1; i < n; i++) {
            int prev = a[i - 1];
            int curr = a[i];
            if ((prev % 2 == 1 && curr % 2 == 1) || (prev % 2 == 0 && curr % 2 == 0)) {
                ops++;
            }

        }

        System.out.println(ops);

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