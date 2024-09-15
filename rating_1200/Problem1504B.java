import java.util.*;

public class Problem1504B {
    static int n;
    static String a, b;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = sc.next();
        b = sc.next();
        a += '1';
        b += '1';

        int cnt = 0; // cnt = 0 means equal 0s and 1s, cnt > 1 means more 0s, cnt < 0 means more 1s

        for (int i = 0; i < n; i++) {
            cnt += (a.charAt(i) == '1' ? 1 : -1);
            if ((a.charAt(i) == b.charAt(i)) != (a.charAt(i + 1) == b.charAt(i + 1)) && cnt != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
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