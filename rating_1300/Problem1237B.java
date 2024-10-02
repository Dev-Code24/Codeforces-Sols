import java.io.*;
import java.util.*;

public class Problem1237B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static int N;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int N = Integer.parseInt(nextToken());

        var a = new HashMap<Integer, Integer>();
        for (int i = 1; i <= N; i++) {
            int el = Integer.parseInt(nextToken());
            a.put(el, i);
        }
        int b[] = new int[N];
        for (int i = 0; i < N; i++) {
            int el = Integer.parseInt(nextToken());
            b[i] = a.get(el);
        }
        // tell how many cars should be fined
        int cars = 0;
        int small = b[N - 1];
        for (int i = N - 1; i > 0; i--) {
            if (small > b[i]) {
                small = b[i];
            }
            if (b[i - 1] > small) {
                cars++;
            }
        }

        out.println(cars);
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