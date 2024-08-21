import java.util.*;

public class Problem1141A {
    static int n, m;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        m = sc.nextInt();

        if (m % n != 0) {
            System.out.println(-1);
            return;
        }
        m = m / n;
        int i = 0;
        for (;; i++) {
            if (m % 2 == 0) {
                m /= 2;
                continue;
            } else if (m % 3 == 0) {
                m /= 3;
                continue;
            } else {
                break;
            }
        }
        System.out.println(i);
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