import java.io.*;
import java.util.*;

import static java.lang.Math.abs;
import static java.lang.Integer.parseInt;

public class Problem1991C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            long a[] = new long[n];
            boolean odd = false, even = false;
            for (int i = 0; i < n; i++) {
                a[i] = parseInt(nextToken());
                if(a[i] % 2 == 1) odd = true;
                if(a[i] % 2 == 0) even = true;
            }

            if(odd && even) {
                out.println(-1);
                continue;
            }

            Queue<Integer> q = new LinkedList<>();

            for(int i = 29; i >= 0; i--) {
                for(int j = 0; j < n; j++) a[j] = abs(a[j] -(long) (1 << i));
                q.offer((1 << i));
            }

            long sum = Arrays.stream(a).sum();
            if(sum == n) {
                q.offer(1);
                out.println(31);
            }else {
                out.println(30);
            }

            for(long el : q) {
                out.print(el + " ");
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