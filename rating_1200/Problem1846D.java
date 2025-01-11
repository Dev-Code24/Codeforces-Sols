import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1846D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), d = parseInt(nextToken()), h = parseInt(nextToken());
            double y[] = new double[n];
            for (int i = 0; i < n; i++) {
                y[i] = parseInt(nextToken());
            }

            double ans = area(h, d);
            for (int i = 0; i + 1 < n; i++) {
                if (y[i + 1] - y[i] <= h) {
                    double dd = (double) d * ((h - y[i + 1] + y[i]) / (double) h);
                    double hh = (y[i + 1] - y[i]);
                    ans += hh * ((d + dd) / 2.0);
                } else {
                    ans += area(h, d);
                }
            }
            out.printf("%.6f%n", ans);

        }

        out.flush();
        out.close();
        br.close();
    }

    static double area(double _h, double _d) {
        return (_d * _h) / 2.0D;
    }

    static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}