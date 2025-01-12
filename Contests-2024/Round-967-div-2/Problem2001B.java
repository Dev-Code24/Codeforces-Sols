import java.util.*;

public class Problem2001B {
    static int n;

    public static void solve(Scanner sc) {
        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(-1);
        } else {
            for (int i = 2; i <= n; i += 2) {
                System.out.print(i + " ");
            }
            System.out.print(1 + " ");
            for (int i = n; i >= 2; i -= 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

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