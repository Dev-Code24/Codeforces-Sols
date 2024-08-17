import java.util.*;

/*
 * Let max and min be the max and min element in the complete array.
 * Then putting the max element at the first position will make the complete
 * array beautiful because then the sum of the prev elements of a[i], i > 0
 * will not be equal to a[i]
 * The only element to be worried about instead of the first element is the second
 * element, because if a[1] = a[0], then array becomes ugly
 * Making the a[1] = min only makes sure that a[1] ≠ a[0]
 * Thus making a[0] = max, and a[1] = min is the easy way to put elements 
 * in array
 */
public class Problem1783A {
    static int n;
    static int a[];
    static int max, min;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        max = a[n - 1];
        min = a[0];
        if (max != min) {
            System.out.println("YES");
            System.out.print(max + " " + min + " ");
            for (int i = 1; i < n - 1; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();

        } else {
            System.out.println("NO");
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