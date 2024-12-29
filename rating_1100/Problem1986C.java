import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1986C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), m = parseInt(nextToken());
            char s[] = nextToken().toCharArray();
            var set = new TreeSet<Integer>();
            for (int i = 0; i < m; i++) {
                set.add(parseInt(nextToken()) - 1);
            }
            char c[] = nextToken().toCharArray();
            Arrays.sort(c);
            int i = 0;
            for (int ind : set) {
                s[ind] = c[i++];
            }

            out.println(new String(s));

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