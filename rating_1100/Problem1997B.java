import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1997B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            char s[][] = new char[2][n];
            for (int i = 0; i < 2; i++) {
                s[i] = nextToken().toCharArray();
            }

            int cnt = 0;

            for (int i = 0; i < 2; i++) {
                for (int j = 1; j < n - 1; j++) {
                    int opp = 1 - i;
                    if (s[i][j] == '.' && s[i][j - 1] == '.' && s[i][j + 1] == '.') {
                        if (s[opp][j] == '.' && s[opp][j - 1] == 'x' && s[opp][j + 1] == 'x') {
                            cnt++;
                        }
                    }
                }
            }

            out.println(cnt);

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