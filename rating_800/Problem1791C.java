import java.util.*;

public class Problem1791C {
    static int n;
    static String bits;
    static int i, j;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        bits = sc.next();

        i = 0;
        j = n - 1;

        while (i < j) {
            char cstart = bits.charAt(i);
            char cend = bits.charAt(j);
            if ((cstart == '1' && cend == '0') || (cstart == '0' && cend == '1')) {
                i++;
                j--;
            } else {
                break;
            }
        }

        System.out.println(j - i + 1);
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