import java.util.*;

/*
 * Maximum possible gcd of a and b is also a divisor of Delta = a - b;
 * The following steps is the solution
 * let a = 8 and b = 5
 * => Delta = a - b = 3
 * 
 * To align a and b with multiples of Delta, consider the following:
 * 
 * - Current Modulus:
 * - a % Delta = 8 % 3 = 2
 * - b % Delta = 5 % 3 = 2)
 * 
 * To make both a and b multiples of 3, you can:
 * - Increase Operation:
 * - Increase a by 3 - 2 = 1 to reach 9 (next multiple of 3).
 * - Increase b by 3 - 2 = 1 to reach 6 (next multiple of 3).
 * 
 * - ** Decrease Operation**:
 * - Decrease a by 2 to reach 6 (previous multiple of 3).
 * - Decrease b by 2 to reach 3 (previous multiple of 3).
 * 
 * ### Choosing the Minimum Moves
 * 
 * - To minimize the moves:
 * - For a = 8, either increase by 1 or decrease by 2.
 * - For b = 5, either increase by 1 or decrease by 2.
 * 
 * The minimum number of moves is 1 (increasing both by 1).
 */
public class Problem1543A {
    public static void solve(Scanner sc) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (a == b)
            System.out.println(0 + " " + 0);
        else {
            long delta = Math.abs(a - b);
            long moves = Math.min(a % delta, delta - a % delta);
            System.out.println(delta + " " + moves);
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

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
