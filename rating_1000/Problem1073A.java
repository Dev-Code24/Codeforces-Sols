import java.util.*;

public class Problem1073A {
    static int n;
    static String s;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        s = sc.next();

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                System.out.println("YES");
                System.out.println("" + s.charAt(i) + s.charAt(i + 1));
                return;
            }
        }
        System.out.println("NO");

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