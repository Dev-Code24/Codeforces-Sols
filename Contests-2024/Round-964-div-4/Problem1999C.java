import java.util.*;

public class Problem1999C {
    static int n, s, m;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        s = sc.nextInt();// time taken to bath
        m = sc.nextInt();// total time in a day
        Pair arr[] = new Pair[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = new Pair(a, b);
        }
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        // int day[] = new int[m+1];
        // for (int i = -1; i < m + 1; i++) {
        // day[i] = i + 1;
        // }
        if (arr[0].first + 1 > s) {
            System.out.println("YES");
            return;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i].first - arr[i - 1].second + 1 > s) {
                System.out.println("YES");
                return;
            }
        }
        if (m - arr[n - 1].second + 1 > s) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");

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

    static class Pair implements Comparable<Pair> {
        int first;
        int second;

        Pair(int _first, int _second) {
            this.first = _first;
            this.second = _second;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.first, o.first);
        }

        @Override
        public String toString() {
            return "(" + first + ',' + second + ")";
        }
    }
}