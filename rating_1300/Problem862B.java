import java.io.*;
import java.util.*;

public class Problem862B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static int n;
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    static long cnt[] = new long[2];

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        n = Integer.parseInt(nextToken());
        for (int i = 0; i < n + 1; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 1; i < n; i++) {
            int u, v;
            u = Integer.parseInt(nextToken());
            v = Integer.parseInt(nextToken());
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        dfs(1, 0, 0);
        out.println(cnt[0] * cnt[1] - n + 1);
        out.flush();
        out.close();
        br.close();
    }

    private static void dfs(int node, int pnode, int color) {
        cnt[color]++;
        for (int i = 0; i < adj.get(node).size(); i++) {
            if (adj.get(node).get(i) != pnode) {
                dfs(adj.get(node).get(i), node, Math.abs(color - 1));
            }
        }
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