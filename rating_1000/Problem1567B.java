import java.util.*;

public class Problem1567B {
    static int N = (int) 3e5 + 1;
    static int arr[];
    static int a, b;

    public static void solve(Scanner sc) {
        a = sc.nextInt(); // mex of all elements
        b = sc.nextInt(); // xor of all elements

        if (arr[a - 1] == b) {
            System.out.println(a);
        } else {
            long x = arr[a - 1] ^ b;
            if (x == a) {
                System.out.println(a + 2);
            } else {
                System.out.println(a + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        arr = new int[N];
        for (int i = 1; i < N; i++) {
            arr[i] = arr[i - 1] ^ i;
        }
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