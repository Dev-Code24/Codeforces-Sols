import java.io.*;
import java.util.*;
import static java.lang.Math.max;

public class Problem2027C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken());
            long A[] = new long[N + 1];
            for (int i = 1; i <= N; i++)
                A[i] = Long.parseLong(nextToken());

            Pair p[] = new Pair[N + 1];
            p[0] = new Pair();
            p[1] = new Pair();
            p[N] = new Pair();

            for (int i = 2; i <= N; i++) {
                p[i] = new Pair(0, 0);
                p[i].first = A[i] + i - 1;
                p[i].second = i - 1;
            }
            Arrays.sort(p, (a, b) -> Long.compare(a.first, b.first));

            long mx = N;
            var set = new TreeSet<Long>();
            set.add(mx);
            for (int i = 2; i <= N; i++) {
                if (set.contains(p[i].first)) {
                    mx = max(mx, p[i].first + p[i].second);
                    set.add(p[i].first + p[i].second);
                }
            }
            out.println(mx);
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

    static class Pair implements Comparable<Pair> {
        long first;
        long second;

        Pair() {
            this.first = 0L;
            this.second = 0L;
        }

        Pair(long _first, long _second) {
            this.first = _first;
            this.second = _second;
        }

        @Override
        public int compareTo(Pair o) {
            return Long.compare(this.first, o.first);
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