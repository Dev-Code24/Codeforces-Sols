import java.util.*;

public class Problem1766A {
    static String s;

    public static void solve(Scanner sc) {
        s = sc.next();
        // 1 to 10 are round
        // 10, 20, 30, ... 100 are round
        // 100, 200, 300, ... 1000 are round
        // 1000, 2000, 3000, ... 10000 are round
        // 10000, 20000, 30000, ... 100000 are round

        int result = (s.charAt(0) - '0' + 9 * (s.length() - 1));
        System.out.println(result);

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