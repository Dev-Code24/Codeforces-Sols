import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class P4 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            long n = Long.parseLong(nextToken());
            int ops = 0;
            while (n > 1) {
                if (n % 6 == 0)
                    n /= 6;
                else
                    n *= 2;
                ops++;
            }
            if (n == 1)
                out.println(ops);
            else
                out.println(-1);
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