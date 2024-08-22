import java.util.*;

public class Problem118B {
    static int n;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            int j = 0;
            // for spaces
            for (; j < n - i; j++) {
                System.out.print("  ");
            }

            // printing the numbers
            for (j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            for (; j >= 0; j--) {
                if (j != 0) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 0; i--) {
            int j = 0;
            // for spaces
            for (; j < n - i; j++) {
                System.out.print("  ");
            }

            // printing the numbers
            for (j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            for (; j >= 0; j--) {
                if (j != 0) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
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