import java.util.*;

/*
 * If not understood the code then refer to the editorial of this problem: https://codeforces.com/blog/entry/112282
 */
public class Problem1791D {
    static int n;
    static String s;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        s = sc.next();

        int[] cnt = new int[26]; // This checks if a char is in the substring a if cnt[i] > 0
        int[] p = new int[26]; // This checks if a char is in the substring b if p[i] > 0
        
        for (char x : s.toCharArray()) {
            cnt[x - 'a']++;
        }
        
        int ans = 0;
        for (char x : s.toCharArray()) {
            cnt[x - 'a']--;
            p[x - 'a']++;
            int cur = 0;
            for (int i = 0; i < 26; i++) {
                cur += Math.min(1, cnt[i]) + Math.min(1, p[i]);
            }
            ans = Math.max(ans, cur);
        }
        
        System.out.println(ans);
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