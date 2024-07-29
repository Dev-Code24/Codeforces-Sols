import java.util.*;

public class Problem1991D {
    static int n;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        if (n < 6) {
            if (n == 1) {
                System.out.println(1);
                System.out.println(1);
            } else if (n == 2) {
                System.out.println(2);
                System.out.println("1 2");
            } else if (n == 3) {
                System.out.println(2);
                System.out.println("1 2 2");
            } else if (n == 4) {
                System.out.println(3);
                System.out.println("1 2 2 3");
            } else if (n == 5) {
                System.out.println(3);
                System.out.println("1 2 2 3 3");
            } else if (n == 6) {
                System.out.println(4);
                System.out.println("1 2 2 3 3 4");
            }
        } else {
            System.out.println(4);
            for (int i = 1; i <= n; i++)
                System.out.print((i % 4 + 1) + " ");
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

    // private static boolean prime(int n) {
    // if (n < 2)
    // return false;
    // for (int x = 2; x * x <= n; x++) {
    // if (n % x == 0)
    // return false;
    // }
    // return true;
    // }

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