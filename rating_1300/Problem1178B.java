import java.io.*;
import java.util.*;

public class Problem1178B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static String s;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        s = nextToken();
        int n = s.length();

        long totW = 0;
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && s.charAt(i) == 'v' && s.charAt(i + 1) == 'v') {
                totW++;
            }
        }
        long currW = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && s.charAt(i) == 'v' && s.charAt(i + 1) == 'v') {
                currW++;
            }
            if (s.charAt(i) == 'o') {
                ans += currW * (totW - currW);
            }
        }

        out.println(ans);

        out.flush();
        out.close();
        br.close();
    }

    static String nextToken() throws IOException {
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