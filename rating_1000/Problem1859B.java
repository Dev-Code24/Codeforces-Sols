import java.io.IOException;
import java.util.*;

public class Problem1859B {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();

        int minn = Integer.MAX_VALUE;
        List<Integer> min2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            List<Integer> v = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                v.add(sc.nextInt());
            }

            int minel = Collections.min(v);
            minn = Math.min(minn, minel);
            v.remove((Integer) minel);
            min2.add(Collections.min(v));
        }
        long result = minn + min2.stream().mapToLong(Integer::longValue).sum() - Collections.min(min2);
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int t = 1;
        t = sc.nextInt();
        while (t-- > 0) {
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
    // @Override
    // public int compareTo(Pair o) {
    // return Long.compare(this.first, o.first);
    // }
    // }
}