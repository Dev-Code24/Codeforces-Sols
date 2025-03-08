import java.io.*;
import java.sql.Array;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1799B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = parseInt(nextToken());

        if (Arrays.stream(a).min().getAsInt() == 1) {
            if (Arrays.stream(a).max().getAsInt() == 1) out.println(0);
            else out.println(-1);
            return;
        }

        var list = new ArrayList<Pair>(30 * n);
        while (true) {
            int j = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] < a[j]) j = i;
            }

            var all_eq = true;
            for (int i = 0; i < n; i++) {
                while (a[i] > a[j]) {
                    list.add(new Pair(i, j));
                    a[i] = (a[i] + a[j] - 1) / a[j];
                }
                if (a[i] < a[j]) all_eq = false;
            }
            if (all_eq) break;
        }
        out.println(list.size());
        for(Pair p : list) out.println(p.first + 1 + " " + (p.second + 1));

    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) solve();
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

    static class Pair implements Comparable<Pair> {
        int first;
        int second;

        Pair() {
            this.first = 0;
            this.second = 0;
        }

        Pair(int _first, int _second) {
            this.first = _first;
            this.second = _second;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.first != o.first) {
                return Integer.compare(this.first, o.first);
            }
            return Integer.compare(this.second, o.second);
        }

        @Override
        public String toString() {
            return "(" + first + ',' + second + ")";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Pair pair = (Pair) o;
            return first == pair.first && second == pair.second;
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }
}