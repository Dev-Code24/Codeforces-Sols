import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem433B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = parseInt(nextToken());
        long v[] = new long[n];
        long pref[] = new long[n];

        for (int i = 0; i < n; i++) {
            v[i] = parseInt(nextToken());
            if (i == 0) {
                pref[i] = v[i];
            } else {
                pref[i] = pref[i - 1] + v[i];
            }

        }
        int m = parseInt(nextToken());
        Arrays.sort(v);
        for (int i = 1; i < n; i++) {
            v[i] = v[i - 1] + v[i];
        }
        for (int i = 0; i < m; i++) {
            int t = parseInt(nextToken());
            int l = parseInt(nextToken()) - 1, r = parseInt(nextToken()) - 1;
            if (t == 1) {
                if (l - 1 >= 0) {
                    out.println(pref[r] - pref[l - 1]);
                } else {
                    out.println(pref[r]);
                }
            } else {
                if (l - 1 >= 0) {
                    out.println(v[r] - v[l - 1]);
                } else {
                    out.println(v[r]);
                }
            }

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
