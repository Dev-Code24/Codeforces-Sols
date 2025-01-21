import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

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
            int x[] = new int[n];
            for (int i = 0; i < n; i++) x[i] = parseInt(nextToken());

            Arrays.sort(x);
            boolean found = false;
            int k = -1;
            for(int i = n - 2; i >= 0; i--){
                if(x[i] == x[i + 1]) {
                    k = x[i];
                    x[i + 1] = x[i] = 0;
                    break;
                }
            }
            if(k == -1) {
                out.println(-1);
                continue;
            }
            Arrays.sort(x);
            for(int i = 2; i + 1 < n; i++) {
                if(2*k + x[i] > x[i + 1]) {
                    out.println(k + " " + k + " " + x[i] + " " + x[i + 1]);
                    found = true;
                    break;
                }
            }
            if(!found) {
                out.println(-1);
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