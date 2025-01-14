import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1864B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), k = parseInt(nextToken());
            char s[] = nextToken().toCharArray();

            ArrayList<Character> e = new ArrayList<>(), o = new ArrayList<>();
            for (int i = 1; i < n + 1; i++) {
                if ((i & 1) == 0) {
                    e.add(s[i - 1]);
                } else {
                    o.add(s[i - 1]);
                }
            }

            Collections.sort(o);
            Collections.sort(e);
            StringBuilder sb = new StringBuilder();
            int i = 0, j = 0;
            while (i < o.size() || j < e.size()) {
                if (i < o.size())
                    sb.append(o.get(i++));
                if (j < e.size())
                    sb.append(e.get(j++));
            }

            if ((k & 1) == 0) {
                Arrays.sort(s);
                out.println(new String(s));
                continue;
            }

            out.println(sb.toString());
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