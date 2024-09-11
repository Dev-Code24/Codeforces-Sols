import java.util.*;

public class Problem1927D {
    static int n, a[];
    static int prefix[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        prefix = new int[n];
        prefix[0] = -1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1];
            if (a[i - 1] != a[i]) {
                prefix[i] = i - 1;
            }
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            if (prefix[r] < l)
                System.out.println("-1 -1");
            else
                System.out.println(prefix[r] + 1 + " " + (r + 1));
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
    // @Override
    // public boolean equals(Object o) {
    // if (this == o)
    // return true;
    // if (o == null || getClass() != o.getClass())
    // return false;
    // Pair pair = (Pair) o;
    // return first == pair.first && second == pair.second;
    // }
    // @Override
    // public int hashCode() {
    // return Objects.hash(first, second);
    // }
    // }
}
