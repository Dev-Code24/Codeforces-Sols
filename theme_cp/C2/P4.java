import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class P4 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), a = parseInt(nextToken()), b = parseInt(nextToken());
            char[] s = nextToken().toCharArray();
            int aa = 0, bb = 0, f = -1;

            for (int it = 1; it <= 150; it++) {
                for (int i = 0; i < n; i++) {

                    if (s[i] == 'N' || s[i] == 'S') {
                        bb += s[i] == 'N' ? 1 : -1;
                        if (aa == a && bb == b) {
                            out.println("YES");
                            f = 1;
                            break;
                        }
                    }
                    if (s[i] == 'E' || s[i] == 'W') {
                        aa += s[i] == 'E' ? 1 : -1;
                        if (aa == a && bb == b) {
                            out.println("YES");
                            f = 1;
                            break;
                        }
                    }
                }
                if (f == 1) {
                    break;
                }
            }
            if (f == 1) {
                continue;
            }
            out.println("NO");

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