import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1971C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int a = parseInt(nextToken()), b = parseInt(nextToken());
            int c = parseInt(nextToken()), d = parseInt(nextToken());

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= 12; i++) {
                if (i == a || i == b)
                    sb.append('a');
                if (i == c || i == d)
                    sb.append('b');
            }
            String ans = sb.toString();
            out.println(ans.equals("abab") || ans.equals("baba") ? "YES" : "NO");
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