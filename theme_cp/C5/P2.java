import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.min;

public class P2 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int x = parseInt(nextToken());
            var list = new ArrayList<Integer>();
            int sum = 0, last = 9;
            while (sum < x && last > 0) {
                list.add(min(x - sum, last));
                sum += last;
                last--;
            }

            if (sum < x) {
                out.println(-1);
            } else {
                Collections.reverse(list);
                for (int i : list) {
                    out.print(i);
                }
                out.println();
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