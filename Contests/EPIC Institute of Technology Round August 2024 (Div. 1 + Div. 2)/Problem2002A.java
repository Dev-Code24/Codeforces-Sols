import java.util.*;

/*
 * This is a good problem,
 * here the approach is that suppose there be a k x k matrix, and if we say that this matrix contains 
 * only different colors, then there will be k * k different colors available in the matrix 
 */

 // one of the toughest problem yet I have seen as a ProblemA
 // if still not understood then refer: https://www.youtube.com/watch?v=x4-eEjw89ts&t=122s

public class Problem2002A {
    static int n, m, k;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        System.out.println(Math.min(m, k) * Math.min(n, k));
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