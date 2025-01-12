import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), a = parseInt(nextToken()), b = parseInt(nextToken());
            if (a < b) {
                if ((b - a) % 2 == 0) {
                    out.println("YES");
                } else {
                    out.println("NO");
                }

            } else {
                if ((a - b) % 2 == 0) {
                    out.println("YES");
                } else {
                    out.println("NO");
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