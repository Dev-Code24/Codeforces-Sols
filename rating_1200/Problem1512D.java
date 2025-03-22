import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1512D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
//  Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

//  @FunctionalInterface
//    interface Help {
//        int f(int a);
//   }

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        int[] b = new int[n + 2];
        var mp = new TreeMap<Long, Integer>();
        for (int i = 0; i < n + 2; i++) {
            b[i] = parseInt(nextToken());
            mp.put((long) b[i], mp.getOrDefault((long) b[i], 0) + 1);
        }

        long sum = Arrays.stream(b).asLongStream().sum();
        for (int x : b) {
            sum -= x;
            mp.put((long) x, mp.get((long) x) - 1);
            if (mp.get((long) x) == 0) mp.remove((long) x);

            if ((sum & 1) == 0 && mp.containsKey(sum / 2)) {
                long y = sum / 2;
                mp.put(y, mp.get(y) - 1);
                if (mp.get(y) == 0) mp.remove(y);
                for (long k : mp.keySet()) {
                    int freq = mp.get(k);
                    while (freq-- > 0) out.print(k + " ");
                }
                out.println();
                return;
            }

            mp.put((long) x, mp.getOrDefault((long) x, 0) + 1);
            sum += x;
        }

        out.println(-1);
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) solve();
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