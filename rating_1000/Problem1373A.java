import java.util.*;

public class Problem1373A {
    static long a, b, c;

    public static void solve(Scanner sc) {
        a = sc.nextLong(); // first shop 1 donut price
        b = sc.nextLong(); // b donuts in 1 box
        c = sc.nextLong(); // price of 1 box

        if (a < c) {
            System.out.print(1 + " ");
            if (b * a > c)
                System.out.println(b);
            else
                System.out.println(-1);
        } else {
            System.out.println(-1 + " " + b);
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