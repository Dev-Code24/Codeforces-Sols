import java.io.*;
import java.util.*;

public class Problem2019B {
    static int n, q;
    static long a[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            q = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }

            TreeMap<Long, Long> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {

                long temp = ((long) i + 1) * ((long) n - i) - 1;
                map.put(temp, map.getOrDefault(temp, 0l) + 1);
                if (i > 0) {
                    temp = ((long) n - i) * ((long) i);
                    map.put(temp, map.getOrDefault(temp, 0l) + (a[i] - a[i - 1] - 1));
                }
            }

            st = new StringTokenizer(br.readLine());
            while (q-- > 0) {
                long k = Long.parseLong(st.nextToken());
                out.print(map.getOrDefault(k, 0l) + " ");
            }
            out.println();
        }
        out.flush();
        out.close();
        br.close();
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