import java.util.*;

// Look at the editorial for the solution
public class Problem1632B {
    static int n;
    static int p[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        p = new int[n];

        int k = 0;
        while ((1 << (k + 1)) <= n - 1) {
            ++k;
        }
        for (int i = (1 << k) - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }
        for (int i = (1 << k); i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
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

// 0 1 0 0 0 1
// 1 0 1 1 1 0 XOR
// 1 1 1 1 1 1