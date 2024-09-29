import java.util.*;

public class Problem2001A {
    static int n;
    static Map<Integer, Integer> map;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        // {el -> freq}
        map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        // find the el with max freq
        int maxfreq = 0;
        for (Integer key : map.keySet()) {
            maxfreq = Math.max(maxfreq, map.get(key));
        }


        System.out.println(n - maxfreq);
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