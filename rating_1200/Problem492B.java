import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.max;

public class Problem492B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = parseInt(nextToken()), l = parseInt(nextToken());

        double a[] = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = parseInt(nextToken());
        }

        Arrays.sort(a);
        double ans = a[0];
        for (int i = 1; i < n; i++) {
            ans = max(ans, (a[i] - a[i - 1]) / 2);
        }
        ans = max(ans, (l - a[n - 1]));
        out.printf("%.10f%n", ans);

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