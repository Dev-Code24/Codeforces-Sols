import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class P2 {
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
            for (int i = 0; i < n; i++) {
                a[i] = parseInt(nextToken());
            }

            int ans = 0, local = 0;
            Arrays.sort(a);
            for (int i = 0; i + 1 < n; i += 1) {
                if (a[i] == a[i + 1]) {
                    local++;
                } else {
                    ans += Math.ceilDiv(local, 2);
                    local = 0;
                }
            }
            if (local != 0) {
                ans += Math.ceilDiv(local, 2);
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