import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1744D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = parseInt(nextToken());
            }
            int cnt2s = 0, cnt = 0;
            for (int i = 0; i < n; i++) {
                cnt2s += cnt2s(a[i]);
            }

            if (cnt2s >= n) {
                out.println(0);
            } else {

                List<List<Integer>> foridx = new ArrayList<>();
                for (int i = 0; i <= 32; i++) {
                    foridx.add(new ArrayList<>());
                }

                for (int i = 2; i <= n; i += 2) {
                    int twos = cnt2s(i);
                    foridx.get(twos).add(i);
                }

                for (int i = 32; i >= 0; i--) {
                    // change the _ to some variable like idx, for submission on CF
                    for (int _ : foridx.get(i)) {
                        if (cnt2s >= n) {
                            break;
                        }
                        cnt2s += i;
                        cnt++;
                    }
                }
                out.println(cnt2s >= n ? cnt : -1);

            }
        }

        out.flush();
        out.close();
        br.close();
    }

    static int cnt2s(long num) {
        int cnt = 0;

        while ((num & 1) == 0) {
            num /= 2;
            cnt++;
        }

        return cnt;
    }

    static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}