import java.util.*;

public class Problem1848B {
    static int n, k;
    static int c[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        k = sc.nextInt();

        c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        int lastEncntr[] = new int[k];
        Arrays.fill(lastEncntr, -1);

        int max1_step[], max2_step[];
        // stores the largest distance bw consecutive occurence of c[i]
        max1_step = new int[k];
        // stores the second largest distance bw consecutive occurence of c[i]
        max2_step = new int[k];

        for (int i = 0; i < n; ++i) {
            int step = i - lastEncntr[c[i] - 1];

            if (step > max1_step[c[i] - 1]) {
                max2_step[c[i] - 1] = max1_step[c[i] - 1];
                max1_step[c[i] - 1] = step;
            } else if (step > max2_step[c[i] - 1]) {
                max2_step[c[i] - 1] = step;
            }

            lastEncntr[c[i] - 1] = i;
        }

        for (int i = 0; i < k; ++i) {
            int step = n - lastEncntr[i];

            if (step > max1_step[i]) {
                max2_step[i] = max1_step[i];
                max1_step[i] = step;
            } else if (step > max2_step[i]) {
                max2_step[i] = step;
            }
        }
        int ans = (int) 1e9;
        for (int i = 0; i < k; ++i) {
            ans = Math.min(ans, Math.max((max1_step[i] + 1) / 2, max2_step[i]));
        }
        System.out.println(ans - 1);

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