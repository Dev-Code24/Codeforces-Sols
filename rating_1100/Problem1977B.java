import java.io.*;
import java.util.*;
// import java.math.*;
// import static java.lang.Math.min;
// import static java.lang.Math.max;

public class Problem1977B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int X = Integer.parseInt(nextToken());
            int len = Integer.toBinaryString(X).length();
            int arr[] = new int[32];

            for (int i = len - 1; i >= 0; i--) {
                arr[len - i - 1] = Integer.toBinaryString(X).toCharArray()[i] - '0';
            }

            for (int i = 0; i < len; i++) {
                int j = i;
                while (arr[j] == 1 && arr[j + 1] == 1) {
                    arr[j] = 0;
                    j++;
                }
                if (j - i + 1 > 1) {
                    arr[j] = 0;
                    arr[j + 1] = 1;
                    arr[i] = -1;
                }
            }

            int i = 31;
            for (; i >= 0; i--) {
                if (arr[i] == 1)
                    break;
            }
            out.println(i + 1);
            for (int j = 0; j <= i; j++) {
                out.print(arr[j] + " ");
            }
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

    // private static long sqrt(long x) {
    // return new BigInteger(String.valueOf(x)).sqrt().longValue();
    // }

    // private static long gcd(long a, long b) {
    // while (b != 0) {
    // long temp = b;
    // b = a % b;
    // a = temp;
    // }
    // return a;
    // }

    // private static long lcm(long a, long b) {
    // return a * b / gcd(a, b);
    // }

    // static class Pair implements Comparable<Pair> {
    // long first;
    // long second;
    //
    // Pair(long _first, long _second) {
    // this.first = _first;
    // this.second = _second;
    // }
    // @Override
    // public int compareTo(Pair o) {
    // return Long.compare(this.first, o.first);
    // }
    // @Override
    // public String toString() {
    // return "(" + first + ',' + second + ")";
    // }
    // @Override
    // public boolean equals(Object o) {
    // if (this == o)
    // return true;
    // if (o == null || getClass() != o.getClass())
    // return false;
    // Pair pair = (Pair) o;
    // return first == pair.first && second == pair.second;
    // }
    // @Override
    // public int hashCode() {
    // return Objects.hash(first, second);
    // }
    // }
}