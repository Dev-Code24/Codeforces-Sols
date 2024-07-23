import java.util.*;

public class Problem1990B {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < y; i++) {
            a[i] = -1;
        }

        for (int i = y; i < x; i++) {
            a[i] = 1;
        }

        for (int i = x; i < n; i++) {
            a[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
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
    /*
     * private static long gcd(long a, long b) {
     * while (b != 0) {
     * long temp = b;
     * b = a % b;
     * a = temp;
     * }
     * return a;
     * }
     * private static long lcm(long a, long b) {
     * return a * b / gcd(a, b);
     * }
     */
}