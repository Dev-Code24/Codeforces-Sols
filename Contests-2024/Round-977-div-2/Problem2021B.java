import java.io.*;
import java.util.*;
// import java.math.*;

public class Problem2021B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static int N, X;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            N = Integer.parseInt(nextToken());
            X = Integer.parseInt(nextToken());

            int[] cnt = new int[N + 1];
            for (int i = 0; i < N; i++) {
                int v = Integer.parseInt(nextToken());
                if (v < N) {
                    cnt[v]++;
                }
            }

            var mp = new TreeMap<Integer, Integer>();

            for (int i = 0; i <= N; i++) {
                if (cnt[i] == 0) {
                    if (mp.getOrDefault(i % X, 0) == 0) {
                        out.println(i);
                        break;
                    }
                    int val = mp.get(i % X);
                    mp.put(i % X, val - 1);
                    if (mp.get(i % X) == 0) {
                        mp.remove(i % X);
                    }
                } else if (cnt[i] > 1) {
                    int existingCount = mp.getOrDefault(i % X, 0);
                    mp.put(i % X, existingCount + (cnt[i] - 1));
                }
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