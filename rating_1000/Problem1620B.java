import java.util.*;

public class Problem1620B {
    static int w, h;
    static int k;
    static long a[];

    static long maxArea;

    public static void solve(Scanner sc) {
        w = sc.nextInt();
        h = sc.nextInt();
        maxArea = 0l;

        for (int i = 0; i < 4; i++) {
            k = sc.nextInt();
            a = new long[k];
            for (int j = 0; j < k; j++) {
                a[j] = sc.nextLong();
            }
            long area = (a[k - 1] - a[0]) * (i < 2 ? h : w);
            maxArea = Math.max(maxArea, area);
        }

        System.out.println(maxArea);
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