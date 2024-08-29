import java.util.*;

public class Problem1827A {
    final static int MOD = (int) 1e9 + 7;
    static int n;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    a[j] = sc.nextInt();
                } else {
                    b[j] = sc.nextInt();
                }
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);

        long result = 1;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            while (cnt < n && a[i] > b[cnt])
                cnt++;
            result = (result * (cnt - i) % MOD) % MOD;
        }

        System.out.println(result);
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