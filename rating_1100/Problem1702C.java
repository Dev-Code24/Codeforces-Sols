import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.min;
import static java.lang.Math.max;

public class Problem1702C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = parseInt(nextToken());
        while (T-- > 0) {
            int n = parseInt(nextToken()), k = parseInt(nextToken());
            var mp = new TreeMap<Integer, Integer[]>();
            for (int i = 0; i < n; i++) {
                int a = parseInt(nextToken());
                if (mp.containsKey(a)) {
                    mp.get(a)[0] = min(i, mp.get(a)[0]);
                    mp.get(a)[1] = max(i, mp.get(a)[1]);
                } else {
                    Integer[] arr = new Integer[2];
                    arr[0] = i;
                    arr[1] = i;
                    mp.put(a, arr);
                }

            }
            while (k-- > 0) {
                int a = parseInt(nextToken()), b = parseInt(nextToken());
                if (!mp.containsKey(a) || !mp.containsKey(b)) {
                    out.println("NO");
                } else {
                    int mna = mp.get(a)[0];
                    int mxb = mp.get(b)[1];
                    if (mna <= mxb) {
                        out.println("YES");
                    } else {
                        out.println("NO");
                    }

                }
            }
        }
        out.flush();
        out.close();
        br.close();
    }

    private static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}