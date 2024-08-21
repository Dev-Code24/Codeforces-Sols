import java.util.*;

public class Problem139A {
    static int n;
    static int a[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new int[7];

        for (int i = 0; i < 7; i++) {
            a[i] = sc.nextInt();
        }
        int i = 0;
        for (i = 0; i < 7; i = (i + 1) % 7) {

            n -= a[i];
            if (n <= 0)
                break;
        }
        System.out.println(i % 7 + 1);
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