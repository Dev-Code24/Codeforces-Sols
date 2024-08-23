import java.util.*;

public class Problem109A {
    static int n;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        // 4x + 7y = n
        int x = 0;
        int y = 0;
        for (int i = 0;; i++) {
            x = i;
            y = Math.abs((n - (4 * x)) / 7);
            if ((4 * x) + (7 * y) == n) {
                for (int j = 0; j < x; j++) {
                    System.out.print("4");
                }
                for (int j = 0; j < y; j++) {
                    System.out.print("7");
                }
                System.out.println();
                return;
            }
            if (i == n) {
                System.out.println(-1);
                return;
            }
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
