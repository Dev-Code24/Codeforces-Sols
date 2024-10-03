import java.io.*;
import java.util.*;

public class Problem1077C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static int n;
    static int a[];
    static int MAX = (int) 1e6;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        n = Integer.parseInt(nextToken());
        a = new int[n];

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(nextToken());
            freqMap.put(a[i], freqMap.getOrDefault(a[i], 0) + 1);
            sum += a[i];
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sum -= a[i];
            freqMap.put(a[i], freqMap.get(a[i]) - 1);

            if (sum % 2 == 0 && sum / 2 <= MAX && freqMap.getOrDefault((int) (sum / 2), 0) > 0) {
                ans.add(i);
            }
            
            sum += a[i];
            freqMap.put(a[i], freqMap.get(a[i]) + 1);
        }

        out.println(ans.size());
        if (ans.size() > 0) {
            ans.forEach((el) -> {
                out.print(el + 1 + " ");
            });
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