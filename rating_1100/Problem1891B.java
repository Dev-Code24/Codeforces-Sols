import java.util.*;

public class Problem1891B {
    static int n, q;
    static long a[];
    static int x[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        q = sc.nextInt();
        a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        x = new int[q];
        for (int i = 0; i < q; i++) {
            x[i] = sc.nextInt();
        }
        int max = 31;
        for (int i = 0; i < q; i++) {
            int xi = x[i];
            if (xi < max) {
                for (int j = 0; j < n; j++) {
                    if (a[j] % Math.pow(2, xi) == 0) {
                        a[j] += Math.pow(2, xi - 1);
                    }
                }
                max = xi;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
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