import java.io.*;
import java.util.*;
import static java.lang.Math.max;
import static java.lang.Math.abs;

public class Problem1921D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken()), M = Integer.parseInt(nextToken());
            long[] A = new long[N], B = new long[M];
            for (int i = 0; i < N; i++)
                A[i] = Integer.parseInt(nextToken());
            for (int i = 0; i < M; i++)
                B[i] = Integer.parseInt(nextToken());

            long C[] = new long[N];
            Arrays.fill(C, Integer.MIN_VALUE);
            Arrays.sort(A);
            B = sort_reverse(B);
            int diff = M - N;
            for (int i = 0; i < N; i++) {
                C[i] = max(C[i], abs(A[i] - B[i]));
                C[i] = max(C[i], abs(A[i] - B[i + diff]));
            }

            long res = 0;
            for (long el : C)
                res += el;
            out.println(res);

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

    private static long[] sort_reverse(long arr[]) {
        long res[] = new long[arr.length];
        var list = new ArrayList<Long>(arr.length);
        for (int i = 0; i < arr.length; i++)
            list.add(arr[i]);

        Collections.sort(list);
        Collections.reverse(list);
        for (int i = 0; i < arr.length; i++)
            res[i] = list.get(i);
        return res;
    }
}