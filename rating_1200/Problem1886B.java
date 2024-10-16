import java.io.*;
import java.util.*;
import static java.lang.Math.sqrt;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class Problem1886B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int px, py;
            px = Integer.parseInt(nextToken()); py = Integer.parseInt(nextToken());
            int ax, ay;
            ax = Integer.parseInt(nextToken()); ay = Integer.parseInt(nextToken());
            int bx, by;
            bx = Integer.parseInt(nextToken());by = Integer.parseInt(nextToken());
            
            double a_p = sqrt((ax - px) * (ax - px) + (ay - py) * (ay - py));
            double b_p = sqrt((bx - px) * (bx - px) + (by - py) * (by - py));
            double a_o = sqrt(ax * ax + ay * ay);
            double b_o = sqrt(bx * bx + by * by);
            double a_b = sqrt((ax - bx) * (ax - bx) + (ay - by) * (ay - by));

            double ans = max(min(a_p, b_p),max(min(a_o, b_o),a_b/2));
            ans = min(ans, max(a_p, a_o));
            ans = min(ans, max(b_p, b_o));

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