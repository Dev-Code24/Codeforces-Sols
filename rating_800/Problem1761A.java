import java.util.*;

public class Problem1761A {
    static int n, a, b;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();

        // 1, .... ,a, a + 1, a + 2, .... ,n - b - 1, b, b + 1, ... n

        int l1 = 1;
        int r1 = a;
        int l2 = n - b + 1;
        int r2 = n;

        if ((l2 <= r1 + 2) && (!(a == n && b == n))) {
            System.out.println("NO");

        } else {
            System.out.println("YES");
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