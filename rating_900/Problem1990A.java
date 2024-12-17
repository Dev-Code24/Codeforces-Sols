import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1990A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            var mp = new TreeMap<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                int a = parseInt(nextToken());
                mp.put(a, mp.getOrDefault(a, 0) + 1);
            }

            int f = -1;
            for (int key : mp.keySet()) {
                if ((mp.get(key) & 1) == 1) {
                    out.println("YES");
                    f = 1;
                    break;
                }
            }
            if (f == 1) {
                continue;
            }
            out.println("NO");

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