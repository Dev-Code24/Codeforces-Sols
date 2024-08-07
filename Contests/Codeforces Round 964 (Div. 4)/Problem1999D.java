import java.util.*;

public class Problem1999D {
    static String s, t;

    public static void solve(Scanner sc) {
        s = sc.next();
        t = sc.next();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder tb = new StringBuilder(t);
        int n = s.length();
        int m = t.length();

        int i = 0, j = 0;

        while (i < n) {
            if (j < m && sb.charAt(i) == tb.charAt(j)) {
                i++;
                j++;
            } else if (sb.charAt(i) == '?') {
                if (j < m) {
                    sb.setCharAt(i, tb.charAt(j));
                    i++;
                    j++;
                } else {
                    sb.setCharAt(i, 'a');
                    i++;
                }
            } else {
                i++;
            }
        }

        if (j < m) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        System.out.println(sb.toString());

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