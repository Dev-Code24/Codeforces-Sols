import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1954C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            StringBuilder x = new StringBuilder(nextToken());
            StringBuilder y = new StringBuilder(nextToken());
            int n = x.length();

            boolean f = false;
            for (int i = 0; i < n; i++) {
                if ((x.charAt(i) > y.charAt(i)) == f) {
                    char temp = x.charAt(i);
                    x.setCharAt(i, y.charAt(i));
                    y.setCharAt(i, temp);
                }
                f |= x.charAt(i) != y.charAt(i);
            }

            out.println(x.toString());
            out.println(y.toString());
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
