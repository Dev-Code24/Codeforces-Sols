import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class Problem1945B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            long a = parseLong(nextToken()), b = parseLong(nextToken()), m = parseLong(nextToken());
            long ans = (m / a) + (m / b) + 2;
            out.println(ans);
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