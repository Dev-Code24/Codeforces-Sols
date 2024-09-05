import java.util.*;

public class Problem1729D {
    static int n;
    static long x[], y[];
    static Pair diff[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        x = new long[n];
        y = new long[n];
        diff = new Pair[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            diff[i] = new Pair(y[i] - x[i], i);
        }
        
        Arrays.sort(diff, (a, b) -> Long.compare(b.first, a.first));

        int j = n - 1, cnt = 0;

        for (int i = 0; i < n; i++) {
            while (j > i && diff[i].first + diff[j].first < 0) {
                j--;
            }
            if (j <= i)
                break;
            cnt++;
            j--;
        }

        System.out.println(cnt);

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
        long first;
        long second;

        Pair(long _first, long _second) {
            this.first = _first;
            this.second = _second;
        }

        @Override
        public int compareTo(Pair o) {
            return Long.compare(this.first, o.first);
        }

        @Override
        public String toString() {
            return "(" + first + ',' + second + ")";
        }
    }
}