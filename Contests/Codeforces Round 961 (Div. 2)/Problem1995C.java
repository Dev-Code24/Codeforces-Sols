import java.util.*;


/*
 * If not understood after reading the code 
 * check out the video: https://youtu.be/LBTIqRU1e1Q?t=2172
 */
public class Problem1995C {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long last = 0;
        long ans = 0;

        for (int i = 1; i < n; i++) {
            long v1 = a[i - 1], v2 = a[i];
            int c1 = 0, c2 = 0;

            if (v2 == 1 && v1 > 1) {
                ans = -1;
                break;
            }

            while (v2 < v1) {
                v2 *= v2;
                c2++;
            }

            while (v1 * v1 <= v2) {
                if (v1 == 1) {
                    c1 = -1;
                    break;
                }
                v1 *= v1;
                c1++;
            }

            if (c2 > 0) {
                last += c2;
            } else if (c1 == -1) {
                last = 0;
            } else {
                last = Math.max(0, last - c1);
            }

            ans += last;
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
    // @Override
    // public int compareTo(Pair o) {
    // return Long.compare(this.first, o.first);
    // }
    // }
}