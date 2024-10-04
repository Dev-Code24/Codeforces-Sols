import java.io.*;
import java.util.*;
// import java.math.*;

public class Problem2008D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int n = Integer.parseInt(nextToken());
            int p[] = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                p[i] = Integer.parseInt(nextToken());
            }
            String s = nextToken();

            int F[] = new int[n + 1];
            int vis[] = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                if (vis[i] == 1)
                    continue;
                int cnt = 0, j = i;
                ArrayList<Integer> path = new ArrayList<>();
                while (vis[j] == 0) {
                    vis[j] = 1;
                    cnt += (s.charAt(j - 1) == '0') ? 1 : 0;
                    path.add(j);
                    j = p[j];
                }
                for (var c : path) {
                    F[c] = cnt;
                }
            }

            for (int j = 1; j <= n; j++) {
                out.print(F[j] + " ");
            }
            out.println();
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