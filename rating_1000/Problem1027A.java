import java.util.*;

public class Problem1027A {
    static int n;
    static String s;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        s = sc.next();
        for (int i = 0; i < n / 2; i++) {
            int c1 = s.charAt(i);
            int c2 = s.charAt(n - i - 1);
            if (Math.abs(c2 - c1) != 0 && Math.abs(c2 - c1) != 2) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");

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