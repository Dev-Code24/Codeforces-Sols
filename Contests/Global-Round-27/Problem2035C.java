import java.io.*;
import java.util.*;
import static java.lang.Math.pow;

public class Problem2035C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken());

            var set = new TreeSet<Integer>();
            var al = new ArrayList<Integer>();

            if ((N & 1) == 1) {
                set.addAll(Arrays.asList(N, N - 1, 3, 1));
                for (int i = 1; i <= N; i++) {
                    if (!set.contains(i)) {
                        al.add(i);
                    }
                }
                al.addAll(Arrays.asList(3, 1, N - 1, N));
            } else {
                if (N == 6) {
                    out.println("7\n" + "1 2 4 6 5 3");
                    continue;
                }
                int k = 32 - Integer.numberOfLeadingZeros(N);
                set.addAll(Arrays.asList(N, (int) pow(2, k - 1) - 1, (int) pow(2, k - 1) - 2, 3, 1));
                for (int i = 1; i <= N; i++) {
                    if (!set.contains(i)) {
                        al.add(i);
                    }
                }

                al.addAll(Arrays.asList(3, 1, ((int) pow(2, k - 1) - 2), ((int) pow(2, k - 1) - 1), N));
            }
            int k = 0;
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0)
                    k |= al.get(i - 1);
                else
                    k &= al.get(i - 1);
            }
            out.println(k);

            al.forEach((el) -> {
                out.print(el + " ");
            });

            out.println();
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