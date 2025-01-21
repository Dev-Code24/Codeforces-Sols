import java.io.*;
import java.util.*;

 import static java.lang.Math.min;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem2036D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), m = parseInt(nextToken());
            char grid[][] = new char[n][m];
            for(int i = 0; i < n; i++) {
                grid[i] = nextToken().toCharArray();
            }

            int ans = 0, layers = min(n,m)/2;

            for(int layer = 0; layer < layers; layer++) {
                StringBuilder sb = new StringBuilder();
                int top = layer , bottom = n - layer - 1;
                int left = layer, right = m - layer - 1;

                for(int i = left; i <= right; i++) {
                    sb.append(grid[top][i]);
                }
                for(int i = top + 1; i < bottom; i++) {
                    sb.append(grid[i][right]);
                }
                for(int i = right; i > left; i--) {
                    sb.append(grid[bottom][i]);
                }
                for(int i = bottom; i > top; i--) {
                    sb.append(grid[i][left]);
                }

                sb.append(sb, 0, 3);
                for(int i = 0; i + 3 < sb.length(); i++) {
                    String tmp = "" +  sb.charAt(i) + sb.charAt(i + 1) + sb.charAt(i + 2) + sb.charAt(i + 3);
                    if(tmp.equals("1543")) ans++;
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