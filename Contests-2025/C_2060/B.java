import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static int n,m,cards[][];
    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            n = parseInt(nextToken());
            m = parseInt(nextToken());
            cards = new int[n][m];

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) cards[i][j] = parseInt(nextToken());
            }

            for(int i = 0; i < n; i++) Arrays.sort(cards[i]);

            Pair p[] = new Pair[n];
            for(int i = 0; i < n; i++) p[i] = new Pair(i + 1,cards[i][0]);

            Arrays.sort(p, (p1,p2) -> Integer.compare(p1.second,p2.second));

            int top = -1, f = -1;
            for(int j = 0; j < m; j++) {
                for(int i = 0; i < n; i++) {
                    if(top < cards[p[i].first - 1][j]) top = cards[p[i].first - 1][j];
                    else {
                        f = 1;
                        break;
                    }
                }
                if(f == 1) {
                    break;
                }
            }
            if(f == 1) {
                out.println(-1);
            }else {
                for(int i = 0; i < n; i++) {
                    out.print(p[i].first + " ");
                }
                out.println();
            }
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
             return Integer.compare(this.first, o.first);
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