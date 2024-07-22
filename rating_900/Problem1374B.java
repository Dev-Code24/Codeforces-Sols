import java.util.*;

public class Problem1374B {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        // either multiply by 2 or divide by 6
        int ops = 0;
        while (n > 1) {
            if (n % 6 == 0)
                n /= 6;
            else
                n *= 2;
            ops++;
        }
        if (n == 1)
            System.out.println(ops);
        else
            System.out.println(-1);
        return;

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