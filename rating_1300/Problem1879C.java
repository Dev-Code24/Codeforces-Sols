import java.util.*;

public class Problem1879C {
    static final long mod = 998244353;
    static String s;

    public static void solve(Scanner sc) {
        s = sc.next();
        int n = s.length();

        int line = 1;
        var list = new ArrayList<Integer>();
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                line++;
            } else {
                list.add(line);
                line = 1;
            }
        }
        list.add(line);

        long ans = 0, ways = 1;

        for (var a : list) {
            ans += (a - 1);
            ways *= a;
            ways %= mod;
        }

        for (int i = 1; i <= ans; i++) {
            ways *= i;
            ways %= mod;
        }
        System.out.println(ans + " " + ways);
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