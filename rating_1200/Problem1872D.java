import java.util.*;

public class Problem1872D {
    static int n, x, y;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();

        List<Integer> forx = new ArrayList<>();
        List<Integer> fory = new ArrayList<>();
        int multiplicator = 1;
        long sum1 = 0,sum2 = 0;
        for (int i = x; i <= n; i = x * multiplicator) {
            forx.add(i);
            multiplicator++;
        }
        multiplicator = 1;
        for (int i = y; i <= n; i = y * multiplicator) {
            fory.add(i);
            multiplicator++;
        }

        System.out.println(sum1 - sum2);
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