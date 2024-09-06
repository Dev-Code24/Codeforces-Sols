import java.util.*;

// use this video: https://www.youtube.com/watch?v=nH8YI6D8mz4
// very good problem

public class Problem1704C {
    static int n, m;
    static int a[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        Integer diff[] = new Integer[m];
        for (int i = 0; i < m - 1; i++) {
            diff[i] = a[i + 1] - a[i] - 1;
        }
        diff[m - 1] = (n - a[m - 1]) + (a[0] - 1);
        Arrays.sort(diff, (x, y) -> Integer.compare(y, x));

        int ans = 0, time = 0;
        // The reason time = 4 * i, because, for example, for the tc n=41 and m=5, diff=[9,9,9,9,0]
        // here to secure the first larget gap, total of 2 days will be spent, and in those 2 days
        // 4 houses would get infected in other each gaps (iff gaps.length > 4)
        for (int i = 0; i < m; i++) {
            time = 4 * i;
            if (diff[i] - time <= 0)
                break;
            if (diff[i] - time <= 2) {
                ans += 1;
                break;
            }
            ans += diff[i] - time;
            ans -= 1;
        }
        System.out.println(n - ans);

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