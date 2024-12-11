import java.io.*;
import java.util.*;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem591A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));

        double l = Double.parseDouble(nextToken());
        double p = Double.parseDouble(nextToken());
        double q = Double.parseDouble(nextToken());
        // l / (p + q) = time take by both to meet

        double t = l / (p + q);
        out.printf("%.4f", p * t);

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