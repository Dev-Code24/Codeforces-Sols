import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1559C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        // Start timing
        // long startTime = System.nanoTime();

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = parseInt(nextToken());
            }

            int x = -1;
            if (a[0] == 1) {
                x = 0;
            } else if (a[n - 1] == 0) {
                x = n;
            } else {
                for (int i = 0; i + 1 < n; i++) {
                    if (a[i] == 0 && a[i + 1] == 1)
                        x = i + 1;
                }
            }

            for (int i = 0; i < x; i++) {
                out.print(i + 1 + " ");
            }
            out.print(n + 1 + " ");
            for (int i = x; i < n; i++) {
                out.print(i + 1 + " ");
            }
            out.println();
        }

        // End timing and print elapsed time in seconds
        // long endTime = System.nanoTime();
        // double elapsedTimeInSeconds = (endTime - startTime) / 1_000_000_000.0;
        // out.printf("Elapsed Time: %.6f seconds%n", elapsedTimeInSeconds);
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