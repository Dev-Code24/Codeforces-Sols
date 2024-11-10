import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Template {
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
            // Add logic here
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

    // private static long gcd(long a, long b) {
    //     while (b != 0) {
    //         long temp = b;
    //         b = a % b;
    //         a = temp;
    //     }
    //     return a;
    // }

    // private static long lcm(long a, long b) {
    //     return a * b / gcd(a, b);
    // }

    // static class Pair implements Comparable<Pair> {
    //     long first;
    //     long second;
    //
    //     Pair() {
    //         this.first = 0L;
    //         this.second = 0L;
    //     }

    //     Pair(long _first, long _second) {
    //         this.first = _first;
    //         this.second = _second;
    //     }
    //     @Override
    //     public int compareTo(Pair o) {
    //         return Long.compare(this.first, o.first);
    //     }
    //     @Override
    //     public String toString() {
    //         return "(" + first + ',' + second + ")";
    //     }
    //     @Override
    //     public boolean equals(Object o) {
    //         if (this == o)
    //             return true;
    //         if (o == null || getClass() != o.getClass())
    //             return false;
    //         Pair pair = (Pair) o;
    //         return first == pair.first && second == pair.second;
    //     }
    //     @Override
    //     public int hashCode() {
    //         return Objects.hash(first, second);
    //     }
    // }
}