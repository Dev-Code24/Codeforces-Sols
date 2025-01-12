import java.util.*;

/*
 * First create a prefix array which will store prefix for both the strings
 * the prefix array will be of size arr[26][n+1]
 * Here I have pref[2][26][n+1], 2 becoz I am making a single 3d prefix array instead of 
 * 2 2d prefix arrays, for each string
 * After filling the prefix array, we take l and r as input and then using a for loop,
 * we iterate from 0 to 26 for all the alphabet letters, and find the difference
 * in the occurence of certain alphabets
 * the final answer is total/2 because suppose there is a case, where in the range l to r
 * s[0] = abcd
 * s[1] = bcde
 * Here the difference in the number of alphabets is of 2, but swapping a from s[0] and then
 * resorting s[0], can make s[0] == s[1]
 * Hence the answer will be total/2
 */
public class Problem1996C {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s[] = new String[2];
        s[0] = sc.next();
        s[1] = sc.next();

        int pref[][][] = new int[2][26][n + 1];
        for (Integer t : new Integer[] { 0, 1 }) {
            for (int c = 0; c < 26; c++) {
                for (int i = 0; i < n; i++) {
                    pref[t][c][i + 1] = pref[t][c][i] + (s[t].charAt(i) - 'a' == c ? 1 : 0);
                }
            }
        }

        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            l--;
            int total = 0;
            for (int c = 0; c < 26; c++) {
                int num1 = pref[0][c][r] - pref[0][c][l];
                int num2 = pref[1][c][r] - pref[1][c][l];
                total += Math.abs(num1 - num2);
            }
            System.out.println(total / 2);
        }

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
    //     int first;
    //     int second;

    //     Pair(int _first, int _second) {
    //         this.first = _first;
    //         this.second = _second;
    //     }

    //     @Override
    //     public int compareTo(Pair o) {
    //         return Integer.compare(this.first, o.first);
    //     }

    //     @Override
    //     public String toString() {
    //         return "(" + first + ',' + second + ")";
    //     }
    // }
}