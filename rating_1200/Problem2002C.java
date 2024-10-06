import java.io.*;
import java.util.*;
// import java.math.*;

public class Problem2002C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int n = Integer.parseInt(nextToken());
            long centers[][] = new long[n][2];
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(nextToken());
                int b = Integer.parseInt(nextToken());
                centers[i][0] = a;
                centers[i][1] = b;
            }
            long start[] = new long[2];
            long goal[] = new long[2];
            for (int i = 0; i < 2; i++) {
                start[i] = Integer.parseInt(nextToken());
            }
            for (int i = 0; i < 2; i++) {
                goal[i] = Integer.parseInt(nextToken());
            }
            // dist bw start and goal -- displacement
            long x = Math.abs(goal[0] - start[0]), y = Math.abs(goal[1] - start[1]);
            long dist = x * x + y * y;
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                // dist between circle center and goal
                long xx = Math.abs(centers[i][0] - goal[0]), yy = Math.abs(centers[i][1] - goal[1]);
                long dist2 = xx * xx + yy * yy;

                if (dist >= dist2) {
                    out.println("NO");
                    flag = true;
                    break;
                }
            }
            if (flag)
                continue;
            out.println("YES");

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

    // private static double sqrt(long x) {
    // return new BigInteger(String.valueOf(x)).sqrt().doubleValue();
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