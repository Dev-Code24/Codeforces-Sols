import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            char adj[][] = new char[n][n];
            for(int i = 0; i < n; i++) adj[i] = nextToken().toCharArray();

            int p[] = new int[n], l[] = new int[n], r[] = new int[n];
            Arrays.fill(r, n - 1);
            for (int i = 0; i < n; i++) {
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    if (l[j] == l[i] && r[j] == r[i] && adj[i][j] == '1')
                        cnt++;
                }

                int pos = r[i] - cnt;
                p[pos] = i + 1;

                for (int j = 0; j < n; j++) {
                    if (l[j] == l[i] && r[j] == r[i] && i != j) {
                        if (adj[i][j] == '0') {
                            r[j] = pos - 1;
                        } else {
                            l[j] = pos + 1;
                        }
                    }
                }
                l[i] = r[i] = pos;
            }
            
            for (int i = 0; i < n; i++) {
                out.print(p[i] + " ");
            }
            out.println();
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