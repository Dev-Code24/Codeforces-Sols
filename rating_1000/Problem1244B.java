import java.util.*;

public class Problem1244B {
    static int n;
    static String s;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        s = sc.next();

        // always prefer changing floors
        int stairStart = -1, stairLast = -1;
        for (int i = 0; i < n; ++i) {
            char c = s.charAt(i);
            if (c == '1') {
                if (stairStart == -1) {
                    stairStart = i;
                }
                stairLast = i;
            }
        }
        // no staircase exists
        if (stairStart == -1) {
            System.out.println(n);
        } else {
            System.out.println(Math.max((n - stairStart) * 2, (stairLast + 1) * 2));
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