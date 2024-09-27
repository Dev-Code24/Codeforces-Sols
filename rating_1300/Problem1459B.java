import java.io.*;
import java.util.*;

public class Problem1459B {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int k = n / 2;
        if ((n & 1) == 0) {
            out.println((k + 1) * (k + 1));
        } else {
            out.println(2 * (k + 1) * (k + 2));
        }
        out.flush();
        out.close();
        br.close();
    }

}