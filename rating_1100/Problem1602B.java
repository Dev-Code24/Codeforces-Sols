import java.io.*;
import java.util.*;
import static java.lang.Math.min;

public class Problem1602B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken());
            int A[][] = new int[N + 1][N];
            for (int i = 0; i < N; i++)
                A[0][i] = Integer.parseInt(nextToken());

            var mp = new TreeMap<Integer, Integer>();
            for (int st = 0; st < N; st++) {
                for (int aa : A[st])
                    mp.put(aa, mp.getOrDefault(aa, 0) + 1);

                for (int i = 0; i < N; i++) {
                    A[st + 1][i] = mp.get(A[st][i]);
                }
                mp.clear();
            }
            
            int Q = Integer.parseInt(nextToken());
            for (int i = 0; i < Q; i++) {
                int x, k;
                x = Integer.parseInt(nextToken()) - 1; k = Integer.parseInt(nextToken());
                k = min(N, k);
                out.println(A[k][x]);

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