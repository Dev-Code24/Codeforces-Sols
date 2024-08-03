import java.util.*;

/*
 * If not understood from the following then wathc : https://youtu.be/Kl8PPy3rFRE?t=624
 * This is a problem, which needed a lot of thinking.
 * So what is happening in this problem is, let take a string "ababa"
 * so if the I keep on removing the 2nd element and store the strings formed I will get
 * "aaba","aba","aa","a"
 * now if after some operations I get the string "aba",
 * then I will be making the following strings from the operations of removing the 2nd element
 * "aa","a" --> these were already calculated previously 
 */
public class Problem1917B {
    static int n;
    static String s;

    private static void solve(Scanner sc) {
        n = sc.nextInt();
        s = sc.next();

        long ans = 0;
        int arr[] = new int[26];
        for (int i = 0; i < n; i++) {
            if (arr[s.charAt(i) - 'a'] == 0) {
                arr[s.charAt(i) - 'a'] = 1;
                ans += n - i;
            }
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