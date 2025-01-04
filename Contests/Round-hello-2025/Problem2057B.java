import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem2057B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), k = parseInt(nextToken());
            int a[] = new int[n];
            var mp = new TreeMap<Integer, Integer>();
            int mx = 0;
            for (int i = 0; i < n; i++) {
                int x = parseInt(nextToken());
                a[i] = x;
                mp.put(x, mp.getOrDefault(x, 0) + 1);
                if (mp.getOrDefault(x, 0) > mp.getOrDefault(mx, 0)) {
                    mx = x;
                }
            }

            var list = new ArrayList<Integer>(mp.values());
            list.sort(Collections.reverseOrder());
            int sum = 0, ans = 0;

            for (int l : list) {
                sum += l;
                ans++;
                if (sum >= n - k) {
                    break;
                }
            }

            out.println(ans);
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