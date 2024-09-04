import java.util.*;

public class Problem1790D {
    static int n;
    static Map<Integer, Integer> map;
    static Set<Integer> set;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        map = new HashMap<>();
        set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            map.put(a, map.getOrDefault(a, 0) + 1);
            set.add(a);
            set.add(a + 1);
        }

        int last = 0;
        int res = 0;

        for (var x : set) {
            int c = map.getOrDefault(x, 0);
            res += Math.max(0, c - last);
            last = c;
        }

        System.out.println(res);
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