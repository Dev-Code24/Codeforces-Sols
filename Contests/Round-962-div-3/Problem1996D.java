import java.util.*;


/*
 * A really good mathematics problem
 */
public class Problem1996D {
    static int n, x;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        x = sc.nextInt();
        long cnt = 0;

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b * a <= n; b++) {
                int c = Math.min((n - (a * b)) / (a + b), (x - a - b));
                if (c >= 1)
                    cnt += c;
            }
        }
        System.out.println(cnt); 
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