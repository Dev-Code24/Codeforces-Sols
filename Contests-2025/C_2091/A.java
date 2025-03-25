import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
//  Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

//  @FunctionalInterface
//    interface Help {
//        int f(int a);
//   }

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        var list = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) list.add(parseInt(nextToken()));
        //01.03.2025
        var mp = new TreeMap<Integer,Integer>();
        mp.put(0,3);
        mp.put(1,1);
        mp.put(2,2);
        mp.put(3,1);
        mp.put(5,1);

        int idx = 1;
        for (int i : list) {
            if (mp.getOrDefault(i, 0) > 1) {
                mp.put(i, mp.get(i) - 1);
            } else if (mp.getOrDefault(i, 0) == 1) {
                mp.remove(i);
            }
            if(mp.isEmpty()) {
                out.println(idx);
                return;
            }
            idx++;
        }

        out.println(0);

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
}