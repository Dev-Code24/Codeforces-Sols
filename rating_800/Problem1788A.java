import java.util.*;

public class Problem1788A {
    static int n;
    static int a[];
    static long twos, curr;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new int[n];
        curr = 0;
        twos = 0;
        readArray(a, sc);
        // if k exist then print smallest k otherwise print -1
        for (int i = 0; i < n; i++) {
            if (a[i] == 2) {
                curr++;
                twos--;
            }
            if (twos == curr) {
                System.out.println(i + 1);
                return;
            }
        }

        System.out.println(-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    private static void readArray(int a[], Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 2)
                twos++;
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