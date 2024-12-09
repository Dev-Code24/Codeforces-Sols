import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem2042B {
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
                int c = parseInt(nextToken());
                mp.put(c, mp.getOrDefault(c, 0) + 1);
            }
            int cnt = 0, alice = 0;
            for (int key : mp.keySet()) {
                if (mp.get(key) == 1) {
                    cnt += 1;
                    mp.put(key, 0);
                } else {
                    alice += 1;
                }
            }

            alice += 2 * (cnt - cnt / 2);
            out.println(alice);
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