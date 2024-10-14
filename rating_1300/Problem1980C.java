import java.io.*;
import java.util.*;

public class Problem1980C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken());
            int[] A = new int[N], B = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(nextToken());
            }
            for (int i = 0; i < N; i++) {
                B[i] = Integer.parseInt(nextToken());
            }

            int M = Integer.parseInt(nextToken());
            int D[] = new int[M];
            var mp = new TreeMap<Integer, Integer>();
            for (int i = 0; i < M; i++) {
                D[i] = Integer.parseInt(nextToken());
                mp.put(D[i], mp.getOrDefault(D[i], 0) + 1);
            }

            boolean flag = false;
            for (int i = 0; i < N; i++) {
                if (A[i] == B[i])
                    continue;

                if (!mp.containsKey(B[i])) {
                    out.println("NO");
                    flag = true;
                    break;
                } else {
                    if (mp.get(B[i]) > 1) {
                        mp.put(B[i], mp.get(B[i]) - 1);
                    } else {
                        mp.remove(B[i]);
                    }
                }
            }

            if (flag)
                continue;

            for (var v : B) {
                if (v == D[M - 1]) {
                    out.println("YES");
                    flag = true;
                    break;
                }
            }

            if (flag)
                continue;

            out.println("NO");

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