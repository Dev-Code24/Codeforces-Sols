import java.util.*;

public class Problem1997A {
    static String s;

    public static void solve(Scanner sc) {
        s = sc.next();
        int n = s.length();
        int a[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int ind = s.charAt(i) - 'a';
            a[ind] = 1;
        }
        int j = 0;
        for (; j < 26; j++) {
            if (a[j] == 0)
                break;
        }
        char nocontain = (char) (j + 'a');
        int i = 0;
        char curr, next;
        while (i < n - 1) {
            curr = s.charAt(i);
            next = s.charAt(i + 1);
            System.out.print(curr + "");
            i++;
            if (curr == next)
                break;
        }
        System.out.print(nocontain + "");
        while (i < n) {
            curr = s.charAt(i);
            System.out.print(curr + "");
            i++;
        }
        System.out.println();
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