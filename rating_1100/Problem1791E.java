import java.util.*;

public class Problem1791E {
    static int n;
    static int a[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new int[n];
        long sum = 0l;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);
        for (int i = 0; i < n - 1; i++) {
            long prev = a[i];
            long curr = a[i + 1];
            if (prev < 0 && curr < 0) {
                sum += 2 * (-prev - curr);
                a[i] = (int) -prev;
                a[i + 1] = (int) -curr;
            } else if (prev <= 0 && curr >= 0 || curr <= 0 && prev >= 0) {
                if (curr + prev < 0) {
                    sum += 2 * (-curr - prev);
                    a[i] = (int) -prev;
                    a[i + 1] = (int) -curr;
                } else {
                    continue;
                }
            }
        }
        System.out.println(sum);

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