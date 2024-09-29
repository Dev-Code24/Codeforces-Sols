import java.util.*;

public class Problem2000A {
    static String s;

    public static void solve(Scanner sc) {
        s = sc.next();
        if (s.length() < 3) {
            System.out.println("NO");
            return;
        }
        if ((s.charAt(2) == '0' || (s.length() == 3 && s.charAt(2) == '1'))) {
            System.out.println("NO");
            return;
        }
        if (s.length() >= 2 && !s.substring(0, 2).equals("10")) {
            System.out.println("NO");
            return;
        }
        if (s.length() >= 3 && s.charAt(2) == '0') {
            System.out.println("NO");
            return;
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