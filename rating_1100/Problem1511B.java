import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1511B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int a = parseInt(nextToken()), b = parseInt(nextToken()), c = parseInt(nextToken());

            int x = (int) Math.pow(10, a - 1);
            int y = 1;
            for (int i = 1; i <= b - c; i++) {
                y = 10 * y + 1;
            }
            y = y * (int) Math.pow(10, c - 1);
            
            out.println(x + " " + y);
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