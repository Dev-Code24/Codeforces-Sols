import java.util.*;

public class Problem2005B1 {
    static int n, m, q, a[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();

        a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        for (int i = 1; i <= q; i++) {
            int b = sc.nextInt();
            int k = upper_bound(a, b);

            if (k == 0) {
                System.out.print(a[0] - 1 + " ");
            } else if (k == m) {
                System.out.print(n - a[m - 1] + " ");
            } else {
                System.out.print((a[k] - a[k - 1]) / 2 + " ");
            }
        }
        System.out.println();
    }

    static int upper_bound(int a[], int key) {
        int l = 0, r = a.length - 1;
        int ans = a.length;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] > key) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
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