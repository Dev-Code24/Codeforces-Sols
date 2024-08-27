import java.util.*;

// good problem
public class Problem1899C {
    static int n;
    static ArrayList<Integer> a;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        int ans = a.get(0);
        int min = Math.min(0, a.get(0));
        int sum = a.get(0);

        for (int i = 1; i < n; i++) {
            if (Math.abs(a.get(i) % 2) == Math.abs(a.get(i - 1) % 2)) {
                min = 0;
                sum = 0;
            }
            sum += a.get(i);
            ans = Math.max(ans, sum - min);
            min = Math.min(min, sum);
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