import java.util.*;

public class Problem1475A {
    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        while (n % 2 == 0) {
            n /= 2;
        }
        if (n > 1) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
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