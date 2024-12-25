import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem2043A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            long n = Long.parseLong(nextToken());
            int cnt = 0;
            while (n > 3) {
                n /= 4;
                cnt++;
            }

            out.println(1 << cnt);

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