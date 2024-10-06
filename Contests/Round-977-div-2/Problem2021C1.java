import java.io.*;
import java.util.*;
// import java.math.*;

public class Problem2021C1 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N, M, Q;
            N = Integer.parseInt(nextToken());
            M = Integer.parseInt(nextToken());
            Q = Integer.parseInt(nextToken());

            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(nextToken()) - 1;
            }

            int[] B = new int[M];
            for (int i = 0; i < M; i++) {
                B[i] = Integer.parseInt(nextToken()) - 1;
            }

            boolean[] seen = new boolean[N];
            var ub = new ArrayList<Integer>();
            for (int x : B) {
                if (seen[x])
                    continue;
                ub.add(x);
                seen[x] = true;
            }

            boolean ok = true;
            for (int i = 0; i < ub.size(); i++) {
                if (ub.get(i) != A[i]) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                out.println("YA");
            } else {
                out.println("TIDAK");
            }
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