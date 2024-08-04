import java.util.*;

public class Problem1744C {
    static int negINFINITY = (int) -1e9 + 7;
    static int n;
    static String s;
    static char c;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        c = sc.next().toCharArray()[0];
        s = sc.next();
        s = s + s;
        int k = -1, ans = negINFINITY;
        s = s + s;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'g') {
                k = i;
            }
            if (s.charAt(i) == c) {
                ans = Math.max(ans, k - i);
            }
        }

        System.out.println(ans);

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