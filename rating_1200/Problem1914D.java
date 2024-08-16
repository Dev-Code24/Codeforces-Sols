import java.util.*;

/*
 * For this problem, since only three elements total from the 3 arrays are needed for the maximum solution,
 * we just need to find the max 3 elements from each arrays such that they dont have the same index.
 * 
 */
public class Problem1914D {
    static int n;
    static int a[], b[], c[];
    static int x, y, z;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new int[n];
        b = new int[n];
        c = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        int[] best3A = getBest3(a);
        int[] best3B = getBest3(b);
        int[] best3C = getBest3(c);

        long ans = 0;

        for (int x : best3A) {
            for (int y : best3B) {
                for (int z : best3C) {
                    if (x != y && x != z && y != z) {
                        ans = Math.max(ans, a[x] + b[y] + c[z]);
                    }
                }
            }
        }

        System.out.println(ans);
    }

    private static int[] getBest3(int[] arr) {
        int mx1 = -1, mx2 = -1, mx3 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (mx1 == -1 || arr[i] > arr[mx1]) {
                mx3 = mx2;
                mx2 = mx1;
                mx1 = i;
            } else if (mx2 == -1 || arr[i] > arr[mx2]) {
                mx3 = mx2;
                mx2 = i;
            } else if (mx3 == -1 || arr[i] > arr[mx3]) {
                mx3 = i;
            }
        }

        return new int[] { mx1, mx2, mx3 };
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