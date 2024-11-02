import java.io.*;
import java.util.*;

public class Problem2036B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken()), K = Integer.parseInt(nextToken());

            var mp = new TreeMap<Integer, Integer>();
            for (int i = 0; i < K; i++) {
                int x = Integer.parseInt(nextToken()), y = Integer.parseInt(nextToken());
                mp.put(x, mp.getOrDefault(x, 0) + y);
            }
            PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
            for (var key : mp.keySet()) {
                q.offer(mp.get(key));
            }
            long ans = 0;
            for (int i = 0; i < N && !q.isEmpty(); i++) {
                ans += q.poll();
            }
            out.println(ans);
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