import java.io.*;
import java.util.*;
import static java.lang.Math.max;
// import static java.lang.Math.min;
// import static java.lang.Math.abs;

public class Problem1670B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken());
            String In = nextToken();
            int K = Integer.parseInt(nextToken());
            boolean sp[] = new boolean[26];
            for (int i = 0; i < K; i++)
                sp[nextToken().charAt(0) - 'a'] = true;
            
            int idx = -1;
            for(int i = 0; i < N; i++)
                if(sp[In.charAt(i) - 'a'])
                    idx = i;
                
            int mx = 0;
            for (int i = idx - 1; i >= 0; i--) {
                int j = i;
                while (j > 0 && !sp[In.charAt(j) - 'a'])
                    j--;
                mx = max(mx, i + 1 - j);
                i = j;
            }
            out.println(mx);

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