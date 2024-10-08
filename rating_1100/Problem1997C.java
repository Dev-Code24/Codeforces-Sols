import java.io.*;
import java.util.*;
// import java.math.*;

public class Problem1997C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int n = Integer.parseInt(nextToken());
            String s = nextToken();
            int cnt = 0;
            char[] arr = s.toCharArray();

            for (int i = 0; i < n; i++) {
                if (arr[i] == '(') {
                    cnt++;
                } else if (arr[i] == ')') {
                    cnt--;
                } else {
                    if (cnt > 0) {
                        arr[i] = ')';
                        cnt--;
                    } else {
                        arr[i] = '(';
                        cnt++;
                    }
                }
            }

            var st = new Stack<Integer>();
            int ans = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] == '(') {
                    st.add(i);
                } else {
                    int temp = st.peek();
                    ans += (i - temp);
                    st.pop();
                }
            }

            out.println(ans);
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