import java.util.*;

/*
 * To return the minimum number of occupied diagonals with at least one chip
 * A cell is a part of diagonal if i + j is same with the other cells as well
 */
public class Problem1995A {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        int diagonals = 0;
        int i = 1;
        while (k > 0) {
            if (diagonals == 0) {
                k -= n;
                diagonals++;
            } else {
                k -= (n - i);
                diagonals++;
                if (k > 0) {
                    k -= (n - i);
                    diagonals++;
                }
                i++;
            }
        }
        System.out.println(diagonals);

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