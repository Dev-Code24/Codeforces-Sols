import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1638B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int a[] = new int[n];
            var ev = new ArrayList<Integer>();
            var od = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                a[i] = parseInt(nextToken());
                if ((a[i] & 1) == 0) {
                    ev.add(a[i]);
                } else {
                    od.add(a[i]);
                }
            }
            boolean f = true;
            for (int i = 0; i < ev.size() - 1; i++) {
                if (!f) {
                    break;
                }
                if (f && ev.get(i) > ev.get(i + 1)) {
                    f = false;
                }
            }
            for (int i = 0; i < od.size() - 1; i++) {
                if (!f) {
                    break;
                }
                if (f && od.get(i) > od.get(i + 1)) {
                    f = false;
                }
            }

            out.println(!f ? "NO" : "YES");

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