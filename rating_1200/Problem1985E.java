import java.io.*;
import java.util.*;

public class Problem1985E {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static int X, Y, Z;
    static long K;

    private static long solve(long x, long y, long z) {
        long ways = 1;
        ways *= (X - x + 1);
        ways *= (Y - y + 1);
        ways *= (Z - z + 1);
        return ways;
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            X = Integer.parseInt(nextToken());
            Y = Integer.parseInt(nextToken());
            Z = Integer.parseInt(nextToken());
            K = Long.parseLong(nextToken());

            long cnt = 0;
            for (long x = 1; x <= X; x++) {
                for (long y = 1; y <= Y; y++) {
                    if (x * y > K)
                        continue;

                    long z = K / (x * y);
                    if (x * y * z == K && z <= Z)
                        cnt = Math.max(cnt, solve(x, y, z));
                }
            }

            out.println(cnt);
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