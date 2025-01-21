import java.io.*;
import java.util.*;

import static java.lang.Math.min;
import static java.lang.Integer.parseInt;

public class C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static int n, k;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            n = parseInt(nextToken());
            k = parseInt(nextToken());
            var freq = new TreeMap<Integer,Integer>();
            for(int i = 0; i < n; i++) {
                int x = parseInt(nextToken());
                freq.put(x, freq.getOrDefault(x,0) + 1);
            }

            int ans = 0;
            for(int i = 1; i < (k + 1)/2; i++)
                ans += min(freq.getOrDefault(i,0),freq.getOrDefault(k - i,0));
            if((k&1) == 0)
                ans += freq.getOrDefault(k/2, 0)/2;
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