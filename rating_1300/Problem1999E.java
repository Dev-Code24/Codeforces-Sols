import java.io.*;
import java.util.*;
// import java.math.*;

public class Problem1999E {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));

        int M = (int) 2e5 + 10;
        int[] ops = new int[M];
        for (int i = 0; i < M; i++) {
            ops[i] = 0;
            int x = i;
            while (x > 0) {
                ops[i] += 1;
                x /= 3;
            }
        }
        int[] pref = new int[M + 1];
        for (int i = 0; i < M; i++) {
            pref[i + 1] = pref[i] + ops[i];
        }

        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int l = Integer.parseInt(nextToken());
            int r = Integer.parseInt(nextToken());

            int ans = ops[l];
            // l + 1 and were the pairs taken initially as (x,y)
            // y was converted to 0 and l+1 was multiplied with 3 ops[l] times
            ans += pref[r + 1] - pref[l];
            out.println(ans);
        }
        out.flush();
        out.close();
        br.close();
    }

    private static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    // private static long sqrt(long x) {
    // return new BigInteger(String.valueOf(x)).sqrt().longValue();
    // }

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