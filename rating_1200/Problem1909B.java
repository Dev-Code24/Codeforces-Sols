import java.util.*;

public class Problem1909B {
    static int n;
    static long a[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        // if the array contains atleast 1 odd and 1 even number then k = 2
        // if the array contains only odd or only even, then?

        for (int i = 1; i < 60; i++) {
            Map<Long, Integer> map = new HashMap<>();
            long k = 1l << i;
            for (int j = 0; j < n; j++) {
                map.put(a[j] % k, map.getOrDefault(a[j] % k, 0) + 1);
            }
            if (map.size() == 2) {
                System.out.println(k);
                return;
            }
        }

        System.out.println(2);
        return;
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