import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem2039C1 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int x = parseInt(nextToken());
            long m = Long.parseLong(nextToken());

            var ans = 0;
            for(var i = 1; i < 2 * x && i <= m; i++) {
                if(i == x) continue;
                var xor = i ^ x;
                ans += (x % xor == 0 || i % xor == 0) ? 1 : 0;
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

// x = 6 m = 4
// 1 2 3 4 5 6 7 8 9
// y = 1, 1 ^ x = 1 ^ 6 = 001 ^ 110 = 111 = 7
// y = 2, 2 ^ x = 2 ^ 6 = 010 ^ 110 = 100 = 4
// y = 3, 3 ^ x = 3 ^ 6 = 011 ^ 110 = 101 = 5
// y = 4, 4 ^ x = 4 ^ 6 = 100 ^ 110 = 010 = 2  --
// y = 5, 5 ^ x = 5 ^ 6 = 101 ^ 110 = 011 = 3  --
// y = 7, 7 ^ x = 7 ^ 6 = 111 ^ 110 = 001 = 1 --
// y = 8, 8 ^ x = 8 ^ 6 = 1000 ^ 0110 = 1110 = 14
// y = 9, 9 ^ x = 9 ^ 6 = 1001 ^ 0110 = 1111 = 15
