import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.max;
// import static java.lang.Math.min;
// import static java.lang.Math.abs;

public class Problem1928B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            var set = new TreeSet<Integer>();
            for (int i = 0; i < n; i++) {
                set.add(parseInt(nextToken()));
            }
            int m = set.size();
            int a[] = new int[m], i = 0;
            for (int v : set) {
                a[i++] = v;
            }

            int ans = 0, l = 0, r = 0;
            while (r < m) {
                if (r - l <= n && a[r] - a[l] < n) {
                    ans = max(ans, r - l + 1);
                    r++;
                } else {
                    l++;
                }
            }
            out.println(ans);

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