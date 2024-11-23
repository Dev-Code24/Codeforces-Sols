import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.abs;

public class Problem489B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = parseInt(nextToken()), a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = parseInt(nextToken());
        }

        int m = parseInt(nextToken()), b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = parseInt(nextToken());
        }
        // abs diff between skills can be 1
        int ans = 0;

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (abs(a[i] - b[j]) <= 1) {
                    b[j] = 999;
                    ans++;
                    break;
                }
            }
        }
        out.println(ans);
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