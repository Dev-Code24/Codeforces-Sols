import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1685A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = parseInt(nextToken());
            }
            if (n % 2 == 1) {
                out.println("NO");
                continue;
            }
            Arrays.sort(a);
            int ans[] = new int[n];
            for (int i = 0, j = 0; i < n / 2; i++) {
                ans[j++] = a[i];
                ans[j++] = a[i + (n / 2)];
            }
            int f = -1;
            for (int i = 0; i < n; i++) {
                if (ans[i] == ans[(i + 1) % n]) {
                    f = 1;
                    out.println("NO");
                    break;
                }
            }

            if (f == 1)
                continue;

            out.println("YES");
            for (int i = 0; i < n; i++) {
                out.print(ans[i] + (i != n - 1 ? " " : "\n"));
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
}