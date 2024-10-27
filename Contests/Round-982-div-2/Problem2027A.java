import java.io.*;
import java.util.*;
import static java.lang.Math.min;
import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem2027A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            solve();
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

    private static void solve() throws IOException {
        int N = Integer.parseInt(nextToken());
        int widths[] = new int[N], heights[] = new int[N];
        for (int i = 0; i < N; i++) {
            int w = Integer.parseInt(nextToken()), h = Integer.parseInt(nextToken());
            heights[i] = h;
            widths[i] = w;
        }
        Arrays.sort(heights);
        Arrays.sort(widths);
        int rest = heights[0] + widths[0];
        for (int i = 1; i < N; i++) {
            rest += heights[i] - heights[i - 1] + widths[i] - widths[i - 1];
        }

        out.println(heights[N - 1] + widths[N - 1] + rest);
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