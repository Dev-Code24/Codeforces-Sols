import java.io.*;
import java.util.*;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1950D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static int MAX = (int) 1e5 + 5;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));

        for (int i = 2; i < MAX; i++) {
            boolean bad = false;
            int cur = i;
            while (cur > 0) {
                if (cur % 10 > 1) {
                    bad = true;
                    break;
                }
                cur /= 10;
            }
            if (!bad)
                list.add(i);
        }

        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken());
            out.println(ok(N) ? "YES" : "NO");
        }
        out.flush();
        out.close();
        br.close();
    }

    private static boolean ok(int n) {
        if (n == 1) {
            return true;
        }

        boolean ans = false;
        for (int num : list) {
            if (n % num == 0) {
                ans |= ok(n / num);
            }
        }

        return ans;
    }

    private static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

}
