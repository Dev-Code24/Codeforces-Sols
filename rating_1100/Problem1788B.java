import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1788B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            char n[] = nextToken().toCharArray();
            StringBuilder a = new StringBuilder(), b = new StringBuilder();
            int sum = 0;
            for (int i = 0; i < n.length; i++) {
                int nn = n[i] - '0';
                int x, y;
                if (sum > 0) {
                    x = nn / 2;
                } else {
                    x = (nn + 1) / 2;
                }

                y = nn - x;
                a.append(x);
                b.append(y);
                sum += x - y;
            }

            out.println(parseInt(a.toString()) + " " + parseInt(b.toString()));
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