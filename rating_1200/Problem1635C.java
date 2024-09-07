import java.util.*;

public class Problem1635C {
    static int n;
    static long a[], asort[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new long[n];
        asort = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            asort[i] = a[i];
        }
        // replace ax = ay - az;
        if (a[n - 1] < a[n - 2]) {
            System.out.println(-1);
            return;
        }

        Arrays.sort(asort);
        if (Arrays.equals(asort, a)) {
            System.out.println(0);
            return;
        }

        if (a[n - 1] >= 0) {
            System.out.println(n - 2);
            for (int i = 0; i < n - 2; i++) {
                System.out.println((i + 1) + " " + (n - 1) + " " + (n));
            }
        } else {
            System.out.println(-1);
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

// -6 -4 -3 -2 -1
//
