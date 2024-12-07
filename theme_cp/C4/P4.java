import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class P4 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int p[] = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = parseInt(nextToken());
            }
            int f = -1;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    int k = j + 1;
                    if (p[i] < p[j] && p[j] > p[k]) {
                        out.println("YES");
                        out.println((i + 1) + " " + (j + 1) + " " + (k + 1));

                        f = 1;
                        break;
                    }
                }
                if (f == 1) {
                    break;
                }
            }
            if (f != 1) {
                out.println("NO");
            }

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