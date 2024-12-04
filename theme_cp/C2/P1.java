import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class P1 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int k = parseInt(nextToken());
            var mp = new TreeMap<Integer, Integer>();
            for (int i = 0; i < k; i++) {
                int a = parseInt(nextToken());
                mp.put(a, mp.getOrDefault(a, 0) + 1);
            }
            // k = 2 + n*m -> k - 2 = n * m

            int x = k - 2;
            for (int key : mp.keySet()) {
                if (x % key == 0) {
                    int y = x / key;
                    if (y == key && mp.get(key) > 1) {
                        out.println(key + " " + key);
                        break;
                    } else {
                        if (mp.containsKey(y)) {
                            out.println(key + " " + y);
                            break;
                        }
                    }
                }
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