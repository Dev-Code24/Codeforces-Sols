import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class P3 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = parseInt(nextToken());

        int p = 0;
        while (n-- > 0) {
            char type = nextToken().toCharArray()[0];
            int x = parseInt(nextToken());

            if (type == 'P') {
                p += x;
            }
            if (type == 'B') {
                if (p + 1 <= x) {
                    out.println("YES");
                    p = 0;
                } else {
                    out.println("NO");
                    p -= x;
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