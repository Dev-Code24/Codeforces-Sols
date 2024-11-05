import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1700B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = parseInt(nextToken());
            char in[] = nextToken().toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                sb.append(9 - (in[i] - '0'));
            }
            String res = "";
            if (in[0] != '9') {
                res = sb.toString();
            } else {
                int temp[] = new int[N];
                int carry = 0;
                for (int i = N - 1; i >= 0; i--) {
                    if (i == N - 1) {
                        temp[i] += 2 + (sb.charAt(i) - '0');
                    } else {
                        temp[i] += 1 + (sb.charAt(i) - '0');
                    }
                    temp[i] += carry;
                    carry = 0;
                    if (temp[i] >= 10) {
                        carry++;
                        temp[i] -= 10;
                    }
                }
                for (int i = 0; i < N; i++) {
                    res += temp[i];
                }
            }

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
}