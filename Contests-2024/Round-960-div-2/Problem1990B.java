import java.util.*;

public class Problem1990B {
    static int n, x, y;
    static int a[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        x--;
        y--;

        a = new int[n];
        int curr = -1;
        for (int i = y - 1; i >= 0; i--) {
            a[i] = curr;
            curr = -curr;
        }
        curr = -1;
        for (int i = x + 1; i < n; i++) {
            a[i] = curr;
            curr = -curr;
        }

        for (int i = y; i <= x; i++) {
            a[i] = 1;
        }
        for (Integer el : a) {
            System.out.print(el + " ");
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