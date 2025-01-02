import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1944B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), k = parseInt(nextToken()) * 2;
            int a[] = new int[n + n];
            for (int i = 0; i < (n + n); i++) {
                a[i] = parseInt(nextToken());
            }

            int cnt[] = new int[n + 1];
            for (int i = 0; i < n; i++)
                cnt[a[i]]++;
            ArrayList<Integer> g0 = new ArrayList<>(), g1 = new ArrayList<>(), g2 = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (cnt[i] == 0)
                    g0.add(i);
                else if (cnt[i] == 1)
                    g1.add(i);
                else
                    g2.add(i);
            }

            int v = 0;
            for (int el : g2) {
                if (v < k) {
                    v += 2;
                    out.print(el + " " + el + " ");
                }
            }

            for (int el : g1) {
                if (v < k) {
                    v++;
                    out.print(el + " ");
                }
            }
            out.println();

            v = 0;
            for (int el : g0) {
                if (v < k) {
                    v += 2;
                    out.print(el + " " + el + " ");
                }
            }

            for (int el : g1) {
                if (v < k) {
                    v++;
                    out.print(el + " ");
                }
            }
            out.println();
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