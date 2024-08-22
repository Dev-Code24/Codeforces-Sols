import java.util.*;

// if not understood, watch this: https://www.youtube.com/watch?v=MqRyqCoi6Lc&t=3622s
public class Problem2001D {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] count = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            count[a[i]]++;
        }
        
        boolean[] b = new boolean[n + 1];
        int[] ans = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            int x = a[i];
            count[x]--;
            if (b[x])
                continue;
            while (true) {
                if (k >= 1 && count[ans[k - 1]] > 0 && better(ans, x, k - 1)) {
                    b[ans[k - 1]] = false;
                    k--;
                } else if (k >= 2 && count[ans[k - 1]] > 0 && count[ans[k - 2]] > 0 && better(ans, x, k - 2)) {
                    b[ans[k - 2]] = b[ans[k - 1]] = false;
                    k -= 2;
                } else {
                    break;
                }
            }
            ans[k++] = x;
            b[x] = true;
        }
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    private static boolean better(int[] ans, int x, int i) {
        if (i % 2 == 0)
            return x > ans[i];
        return x < ans[i];
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