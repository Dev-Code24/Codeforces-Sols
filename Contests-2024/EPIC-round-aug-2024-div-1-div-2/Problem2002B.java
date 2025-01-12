import java.io.*;
import java.util.*;

/*
 * If there exist two arrays p and q, and two elements x and y such that these are adjacent to 
 * each other in array p but not adjcent in array q, then Alice wins in this case 
 * but what if no such x and y exist ?
 * if q = p or q = rev(p), then bob will win because, whenever Alice removes something from the front or
 * the end of her array, bob can remove the same thing from the front or the end his array
 * 
 * Dont know why the arraylist code did not work, in fact the code with scanner also did not work
 * Hence I used the bufferReader
 * 
 */
public class Problem2002B {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0)
            solve();
        writer.flush();
    }

    static void solve() throws IOException {
        int n = Integer.parseInt(reader.readLine());
        int[] a = new int[n], b = new int[n];
        String[] s = reader.readLine().split(" ");
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        s = reader.readLine().split(" ");
        for (int i = 0; i < n; i++)
            b[i] = Integer.parseInt(s[i]);
        boolean f1 = true, f2 = true;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i])
                f1 = false;
            if (a[i] != b[n - i - 1])
                f2 = false;
            if (!f1 && !f2)
                break;
        }
        if (f1 || f2) {
            writer.write("Bob\n");
        } else {
            writer.write("Alice\n");
        }
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
    // }
}