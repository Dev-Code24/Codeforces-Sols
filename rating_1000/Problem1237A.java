import java.util.*;

public class Problem1237A {
    static int n;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        int flag = 1;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0) {
                System.out.print(x / 2 + " ");
            } else {
                System.out.print((x + flag) / 2 + " ");
                flag *= -1;
            }

        }

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
// -7 -29 0 3 24 -29 38
// -4 -14 0 1 12 -14 19, sum = 4