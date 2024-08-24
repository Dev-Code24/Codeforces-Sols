import java.util.*;

public class Problem1133A {
    static String s1, s2;

    public static void solve(Scanner sc) {
        s1 = sc.next();
        s2 = sc.next();
        int h1 = Integer.parseInt(s1.substring(0, 2));
        int h2 = Integer.parseInt(s2.substring(0, 2));
        int m1 = Integer.parseInt(s1.substring(3));
        int m2 = Integer.parseInt(s2.substring(3));

        int t1 = h1 * 60 + m1;
        int t2 = h2 * 60 + m2;
        int t3 = (t1 + t2) / 2;
        s1 = (t3 / 60) < 10 ? 0 + "" + (t3 / 60) : (t3 / 60) + "";
        s2 = (t3 % 60) < 10 ? 0 + "" + (t3 % 60) : (t3 % 60) + "";
        System.out.println(s1 + ":" + s2);

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