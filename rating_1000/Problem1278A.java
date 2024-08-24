import java.util.*;

/*
 * just count the frequency of the characters in h, in an array, and while 
 * putting the characters of h in the cnth array, check if it is equal to 
 * cnts array, after adding the current character
 */
public class Problem1278A {
    static String s, h;

    public static void solve(Scanner sc) {
        s = sc.next();
        h = sc.next();

        int n = h.length();
        int[] cnts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnts[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < n; i++) {
            int[] cnth = new int[26];
            for (int j = i; j < n; j++) {
                cnth[h.charAt(j) - 'a']++;
                if (Arrays.equals(cnts, cnth)) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
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