import java.util.*;

public class Problem1993A {
    static int n;
    static String s;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        s = sc.next(); // length = 4n
        int a = 0, b = 0, c = 0, d = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A')
                a++;
            else if (s.charAt(i) == 'B')
                b++;
            else if (s.charAt(i) == 'C')
                c++;
            else if (s.charAt(i) == 'D')
                d++;
        }
        int ans = Math.min(a, n) + Math.min(b, n) + Math.min(c, n) + Math.min(d, n);
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