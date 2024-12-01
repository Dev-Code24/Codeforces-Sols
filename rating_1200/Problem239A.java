import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem239A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int y = parseInt(nextToken()), k = parseInt(nextToken());
        int n = parseInt(nextToken());
        int cnt = 0;
        for (int j = k; j <= n; j += k) {
            if (y < j) {
                out.print(j - y + " ");
                cnt = 1;
            }
        }
        if (cnt == 0) {
            out.println(-1);
        } else {
            out.println();
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