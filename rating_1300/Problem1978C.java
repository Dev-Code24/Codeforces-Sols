import java.io.*;
import java.util.*;
// import java.math.*;

public class Problem1978C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken());
            long K = Long.parseLong(nextToken());

            if ((K & 1) == 1) {
                out.println("NO");
            } else {
                long hf = K / 2;
                // by swapping we can get a sum of 2*(n-(2*i - 1))
                int a[] = new int[N + 1];
                for (int i = 1; i <= N; i++)
                    a[i] = i;
                long check = 0;
                for (int i = 1; i <= N; i += 2) {
                    check += (N - i);
                }
                if (hf > check) {
                    out.println("NO");
                    continue;
                }

                for (int i = 1; i <= N; i++) {
                    if (hf == 0)
                        break;
                    if (hf >= N - (2 * i - 1)) {
                        swap(a, i, N - i + 1);
                        hf -= N - (2 * i - 1);
                    } else {
                        swap(a, i, i + (int) hf);
                        hf = 0;
                    }
                }

                out.println("YES");
                for (int i = 1; i <= N; i++)
                    out.print(a[i] + " ");
                out.println();
            }
        }
        out.flush();
        out.close();
        br.close();
    }

    private static void swap(int arr[], int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
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