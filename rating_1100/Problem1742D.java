import java.util.*;

public class Problem1742D {
    static int n;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        var map = new HashMap<Integer, Integer>();
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            map.put(a, i);
        }
        int ans = -1;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= 1000; j++) {
                if (!map.containsKey(i) || !map.containsKey(j))
                    continue;

                if (gcd(i, j) == 1) {
                    ans = Math.max(ans, map.get(i) + map.get(j));
                }
            }
        }
        System.out.println(ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

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