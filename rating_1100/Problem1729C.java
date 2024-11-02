import java.io.*;
import java.util.*;
import static java.lang.Math.abs;

public class Problem1729C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());

        while (T-- > 0) {
            String s = nextToken();
            TreeMap<Character, TreeSet<Integer>> index = new TreeMap<>();
            for (int i = 0; i < s.length(); i++) {
                index.computeIfAbsent(s.charAt(i), k -> new TreeSet<>()).add(i + 1);
            }

            char start = s.charAt(0), end = s.charAt(s.length() - 1);
            int cost = abs(end - start), count = 0;
            String path = "";

            if (start <= end) {
                for (char c = start; c <= end; c++) {
                    if (index.containsKey(c)) {
                        count += index.get(c).size();
                        for (int pos : index.get(c)) {
                            path += pos + " ";
                        }
                    }
                }
            } else {
                for (char c = start; c >= end; c--) {
                    if (index.containsKey(c)) {
                        count += index.get(c).size();
                        for (int pos : index.get(c)) {
                            path += pos + " ";
                        }
                    }
                }
            }

            out.println(cost + " " + count);
            out.println(path.trim());
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
}
