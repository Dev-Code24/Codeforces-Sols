import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1787B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        var list = new ArrayList<Pair>(32);
        for(int i = 2; i * i <= n; i++) {
            if((n % i) == 0) {
                int c = 0;
                while((n % i) == 0) {
                    c++;
                    n /= i;
                }
                list.add(new Pair(i,c));
            }
        }
        if(n != 1) list.add(new Pair(n,1));

        var mp = new TreeMap<Integer,Integer>();
        for(int i = 0; i < list.size(); i++) mp.put(i,list.get(i).second);

        long res[] = new long[32];
        int l = 0;
        while(!mp.isEmpty()) {
            long val = 1;
            for(int i = 0; i < list.size(); i++) {
                if(mp.containsKey(i) && mp.get(i) > 0) {
                    val *= list.get(i).first;
                    mp.put(i,mp.get(i) - 1);
                    if(mp.get(i) == 0) {
                        mp.remove(i);
                    }
                }
            }
            res[l++] = val;
        }
        long ans = Arrays.stream(res).sum();
        out.println(ans);
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) solve();
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

     static class Pair implements Comparable<Pair> {
         int first;
         int second;

         Pair() {
             this.first = 0;
             this.second = 0;
         }

         Pair(int _first, int _second) {
             this.first = _first;
             this.second = _second;
         }
         @Override
         public int compareTo(Pair o) {
             if (this.first != o.first) {
                 return Integer.compare(this.first, o.first);
             }
             return Integer.compare(this.second, o.second);
         }
         @Override
         public String toString() {
             return "(" + first + ',' + second + ")";
         }
         @Override
         public boolean equals(Object o) {
             if (this == o)
                 return true;
             if (o == null || getClass() != o.getClass())
                 return false;
             Pair pair = (Pair) o;
             return first == pair.first && second == pair.second;
         }
         @Override
         public int hashCode() {
             return Objects.hash(first, second);
         }
     }
}