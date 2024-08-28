import java.util.*;

public class Problem1869B {
    static int n, k, a, b;
    static long arr[][];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        k = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();

        arr = new long[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextLong();
            arr[i][1] = sc.nextLong();
        }

        if (a <= k && b <= k) {
            System.out.println(0);
            return;
        }

        if (b < a) {
            int temp = a;
            a = b;
            b = temp;
        }

        long dist = Math.abs(arr[a - 1][0] - arr[b - 1][0]) + Math.abs(arr[a - 1][1] - arr[b - 1][1]);
        if (k == 0) {
            System.out.println(dist);
            return;
        }
        long dist1 = Long.MAX_VALUE, dist2 = Long.MAX_VALUE;

        for (int i = 0; i < k; i++) {
            dist1 = Math.min(dist1,
                    Math.abs(arr[a - 1][0] - arr[i][0]) + Math.abs(arr[a - 1][1] - arr[i][1]));
        }

        for (int i = 0; i < k; i++) {
            dist2 = Math.min(dist2,
                    Math.abs(arr[b - 1][0] - arr[i][0]) + Math.abs(arr[b - 1][1] - arr[i][1]));
        }
        dist = Math.min(dist, dist1 + dist2);
        System.out.println(dist);
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
    // long xcord;
    // long ycord;

    // Pair(long _xcord, long _ycord) {
    // this.xcord = _xcord;
    // this.ycord = _ycord;
    // }

    // @Override
    // public int compareTo(Pair o) {
    // return Long.compare(this.xcord, o.xcord);
    // }

    // @Override
    // public String toString() {
    // return "(" + xcord + ',' + ycord + ")";
    // }
    // }
}