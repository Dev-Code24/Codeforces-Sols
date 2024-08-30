import java.util.*;

public class Problem1797B {
    static int n, k;
    static char a[][];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        k = sc.nextInt();
        sc.nextLine();
        a = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine().replace(" ", "");
            a[i] = s.toCharArray();
        }
        int diff = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[n - i - 1][n - j - 1]) {
                    diff++;
                }
            }
        }

        diff /= 2;
        if (diff > k) {
            System.out.println("NO");
        } else {
            k -= diff;
            if (n % 2 == 1) {
                System.out.println("YES");
            } else if (k % 2 == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
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