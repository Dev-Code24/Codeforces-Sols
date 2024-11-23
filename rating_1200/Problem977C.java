import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem977C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = parseInt(nextToken()), k = parseInt(nextToken());
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = parseInt(nextToken());
        }

        Arrays.sort(a);

        int ans = 0;
        if (k == 0) {
            ans = a[0] - 1;
        } else {
            ans = a[k - 1];
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += (a[i] <= ans) ? 1 : 0;
        }

        if (cnt != k || !(1 <= ans && ans <= (int) 1e9)) {
            out.println(-1);
        } else {
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