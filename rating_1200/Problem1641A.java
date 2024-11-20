import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1641A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            long x = Long.parseLong(nextToken());
            long[] a = new long[n];
            var mp = new TreeMap<Long, Integer>();

            for (int i = 0; i < n; i++) {
                a[i] = parseInt(nextToken());
                mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
            }

            Arrays.sort(a);
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                if (mp.get(a[i]) == 0)
                    continue;

                long required = a[i] * x;
                if (mp.containsKey(required) && mp.get(required) > 0) {
                    mp.put(a[i], mp.get(a[i]) - 1);
                    mp.put(required, mp.get(required) - 1);
                } else {
                    mp.put(a[i], mp.get(a[i]) - 1);
                    cnt++;
                }
            }

            out.println(cnt);
        }

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
}
