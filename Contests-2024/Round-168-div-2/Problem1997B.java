import java.util.*;

public class Problem1997B {
    static int n;
    static char c[][];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        c = new char[2][n];
        c[0] = sc.next().toCharArray();
        c[1] = sc.next().toCharArray();

        int count = 0;
        /*
         *  j-1  j  j+1
         *   .   .   .
         *   x   .   x
         *
         *   x   .   x
         *   .   .   .
         */
        for (int row = 0; row < 2; row++) {
            int opp = 1 - row;
            for (int j = 1; j < n - 1; j++) {
                if (c[row][j] == '.' && c[row][j - 1] == '.' && c[row][j + 1] == '.') {
                    if (c[opp][j] == '.' && c[opp][j + 1] == 'x' && c[opp][j - 1] == 'x')
                        count++;
                }
            }
        }

        System.out.println(count);

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