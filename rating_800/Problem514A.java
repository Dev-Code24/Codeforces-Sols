import java.util.*;

public class Problem514A {
    static String X, ans;

    public static void solve(Scanner sc) {
        ans = "";
        for (int i = 0; i < X.length(); i++) {
            int c = X.charAt(i) - '0';
            int diff = 9 - c;
            if (diff < c) {
                if (diff == 0 && i == 0)
                    ans += c;
                else
                    ans += diff;
            } else {
                ans += c;
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        X = sc.next();
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