import java.util.*;

public class Problem1373B {
    public static void solve(Scanner sc) {
        String s = sc.next();

        int c0 = 0, c1 = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '1')
                c1++;
            else
                c0++;
        }

        if (Math.min(c0, c1) % 2 == 1) {
            System.out.println("DA");
        } else {
            System.out.println("NET");
        }
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