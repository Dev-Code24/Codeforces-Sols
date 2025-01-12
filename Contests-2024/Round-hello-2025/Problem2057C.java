import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem2057C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int l = parseInt(nextToken()), r = parseInt(nextToken());

            int a = 0, b = 0, c = 0;

            for (int i = 31; i >= 0; i--) {
                if ((((l ^ r) >> i) & 1) == 1) {
                    a |= (1 << i);
                    b |= (1 << i) - 1;
                    break;
                } else {
                    a |= (l & (1 << i));
                    b |= (l & (1 << i));
                }
            }

            c = l;
            while (c == a || c == b) {
                c++;
            }

            out.println(a + " " + b + " " + c);
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