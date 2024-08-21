import java.util.*;

public class Problem1430C {
    static int n;
    static int a[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }

        if (n < 2) {
            System.out.println(1);
            System.out.println(1);
        } else {
            if (n == 2) {
                System.out.println(2);
                System.out.println(a[0] + " " + a[1]);
            } else {
                System.out.println(2);
                int lastIdx = n - 1;
                System.out.println(a[lastIdx] + " " + a[lastIdx - 2]);
                a[lastIdx - 2] = (int) Math.ceil((a[lastIdx] + a[lastIdx - 2]) / 2);
                for (int i = lastIdx - 1; i >= 1; i--) {
                    System.out.println(a[i] + " " + a[i - 1]);
                    a[i - 1] = (int) Math.ceil((a[i] + a[i - 1]) / 2);
                }
            }
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